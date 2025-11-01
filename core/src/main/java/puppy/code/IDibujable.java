package puppy.code;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface IDibujable {
    
    /**
     * @param batch El SpriteBatch en el que se dibujará el objeto.
     */
    public void dibujar(SpriteBatch batch);
}