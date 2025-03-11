package renderWindow.GameEnvironment.renderable.renderObject;
import java.awt.Graphics;

import renderWindow.GameEnvironment.renderable.Renderable;
public class RenderObject extends Renderable {
    private Shape shape = new Rect();
    public RenderObject(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public void draw(Graphics pen) {
        shape.draw(pen, getObjX(), getObjY(), getObjW(), getObjH());
    }

}
