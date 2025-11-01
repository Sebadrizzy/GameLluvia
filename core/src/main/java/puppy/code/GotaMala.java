package puppy.code;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class GotaMala extends Gota {

    public GotaMala(Texture textura, Rectangle area) {
        // Llama al constructor del padre (Gota)
        super(textura, area);
    }

    @Override
    public void alChocar(Tarro tarro) {
        tarro.dañar();
    }
}