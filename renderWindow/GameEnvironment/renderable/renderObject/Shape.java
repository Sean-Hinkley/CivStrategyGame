package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Graphics;

public abstract class Shape {
    public abstract void draw(Graphics pen, RenderObject ro);
    public abstract void draw(Graphics pen, RenderObject ro, int x, int y);
}
