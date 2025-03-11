package renderWindow.GameEnvironment.renderable.renderObject;
import java.awt.Color;
import java.awt.Graphics;

import renderWindow.GameEnvironment.renderable.Renderable;
public class RenderObject extends Renderable {
    private Color color;
    private Shape shape;
    public RenderObject(int x, int y, int w, int h, Shape s, Color c) {
        super(x, y, w, h);
        color = c;
        shape = s;
    }
    public void draw(Graphics pen) {shape.draw(pen, this);}

    public Color getColor() {
        
    }
}
