package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Shape{

    @Override
    public void draw(Graphics pen, RenderObject ro) {
        pen.setColor(ro.getColor());
        pen.fillRect(ro.getObjX(),ro.getObjY(),ro.getObjW(),ro.getObjH());
    }

    @Override
    public void draw(Graphics pen, RenderObject ro, int x, int y) {
        pen.setColor(ro.getColor());
        pen.fillRect(x,y,ro.getObjW(),ro.getObjH());
        
    }
    
}
