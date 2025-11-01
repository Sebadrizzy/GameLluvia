package puppy.code;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator; // <--- AÑADIR IMPORT

public class Lluvia {

	private Array<Gota> gotas;
	private long lastDropTime;
	private Texture gotaBuena;
	private Texture gotaMala;
	private Sound dropSound;
	private Music rainMusic;

	public Lluvia(Texture gotaBuena, Texture gotaMala, Sound ss, Music mm) {
		rainMusic = mm;
		dropSound = ss;
		this.gotaBuena = gotaBuena;
		this.gotaMala = gotaMala;
	}

	public void crear() {
		gotas = new Array<Gota>();
		crearGotaDeLluvia();

		rainMusic.setLooping(true);
		rainMusic.play();
	}

	private void crearGotaDeLluvia() {
		Rectangle areaGota = new Rectangle();
		areaGota.x = MathUtils.random(0, 800 - 64);
		areaGota.y = 480;
		areaGota.width = 64;
		areaGota.height = 64;

		// --- LÓGICA DE CREACIÓN POLIMÓRFICA ---
		if (MathUtils.random(1, 10) < 3) {
			// Crear una GotaMala
			gotas.add(new GotaMala(gotaMala, areaGota));
		} else {
			// Crear una GotaBuena
			gotas.add(new GotaBuena(gotaBuena, areaGota, dropSound));
		}

		lastDropTime = TimeUtils.nanoTime();
	}

	public void actualizarMovimiento(Tarro tarro) {
		// generar gotas de lluvia
		if (TimeUtils.nanoTime() - lastDropTime > 100000000)
			crearGotaDeLluvia();

		// revisar si las gotas cayeron al suelo o chocaron con el tarro
		// Usamos un Iterador para eliminar de forma segura mientras recorremos
		Iterator<Gota> iter = gotas.iterator();
		while (iter.hasNext()) {
			Gota gota = iter.next();

			// 1. Mover la gota (Lógica de Gota.java)
			gota.mover();

			// 2. Si cae al suelo, se elimina
			if (gota.estaFueraDePantalla()) {
				iter.remove();
				continue; // Saltar a la siguiente gota
			}

			// 3. Si choca con el tarro...
			if (gota.getArea().overlaps(tarro.getArea())) {

				// --- ¡AQUÍ OCURRE EL POLIMORFISMO! ---
				gota.alChocar(tarro);

				iter.remove(); // La eliminamos después de chocar
			}
		}
	}

	public void actualizarDibujoLluvia(SpriteBatch batch) {

		// definido en la interfaz IDibujable.
		for (Gota gota : gotas) {
			gota.dibujar(batch);
		}
	}

	public void destruir() {
		dropSound.dispose();
		rainMusic.dispose();
	}

}