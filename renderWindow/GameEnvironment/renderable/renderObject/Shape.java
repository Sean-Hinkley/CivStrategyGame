package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Graphics;

public abstract class Shape {
    public abstract void draw(Graphics pen,int x, int y, int w, int h);
}
