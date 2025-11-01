package puppy.code;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class GotaBuena extends Gota {
    
    private Sound dropSound;
    private int puntosASumar = 10;

    public GotaBuena(Texture textura, Rectangle area, Sound dropSound) {
        // Llama al constructor del padre (Gota)
        super(textura, area);
        this.dropSound = dropSound;
    }

    @Override
    public void alChocar(Tarro tarro) {
        tarro.sumarPuntos(puntosASumar);
        dropSound.play();
    }
}