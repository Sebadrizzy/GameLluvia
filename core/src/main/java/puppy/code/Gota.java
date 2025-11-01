package puppy.code;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class Gota implements IDibujable {

    // Atributos protegidos para que las clases hijas puedan acceder
    protected Rectangle area;
    protected Texture textura;
    protected int velocidad = 300; // Velocidad de caída base

    public Gota(Texture textura, Rectangle area) {
        this.textura = textura;
        this.area = area;
    }

    public void mover() {
        area.y -= velocidad * Gdx.graphics.getDeltaTime();
    }

    @Override
    public void dibujar(SpriteBatch batch) {
        batch.draw(textura, area.x, area.y);
    }

    /**
     * Define QUÉ hacer al chocar, pero no CÓMO.
     * Las clases hijas (GotaBuena, GotaMala) deberán implementarlo.
     * @param tarro El tarro con el que se ha colisionado.
     */
    public abstract void alChocar(Tarro tarro);

    // --- Métodos de utilidad ---
    
    public Rectangle getArea() {
        return area;
    }

    public boolean estaFueraDePantalla() {
        return area.y + area.height < 0;
    }
}