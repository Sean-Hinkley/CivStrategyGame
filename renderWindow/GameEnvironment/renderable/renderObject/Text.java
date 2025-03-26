package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Font;
import java.awt.Graphics;

public class Text extends Shape{
    String text;
    String d = "times new roman";
    int type = 0;
    int size = 40;
    public Text(String s,String d, int t, int g) {
        text = s;
        this.d = d;
        type = t;
        size = g;
    }
    public Text(String s) {
        text = s;
    }
    @Override
    public void draw(Graphics pen, RenderObject ro) {
        Font f = new Font(text,Font.BOLD,size);
        pen.setFont(f);
        pen.setColor(ro.getColor());
        pen.drawString(text, ro.getObjX(),ro.getObjY());
    }

    @Override
    public void draw(Graphics pen, RenderObject ro, int x, int y) {
        Font f = new Font(text,Font.BOLD,size);
        pen.setFont(f);
        pen.setColor(ro.getColor());
        pen.drawString(text, x,y);
    }

    public String getString() {
        return text;
    }

    public int getSize() {return size;}
    
}
