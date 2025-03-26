package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Font;
import java.awt.Graphics;

public class TextBox extends Text{

    public TextBox(String s) {
        super(s);
        //TODO Auto-generated constructor stub
    }

    public TextBox(String s,String f, int t, int si) {
        super(s,f,t,si);
        //TODO Auto-generated constructor stub
    }
    
        @Override
    public void draw(Graphics pen, RenderObject ro) {
        pen.setFont(new Font(text, type, size));
        pen.setColor(ro.getColor());
        pen.drawRect(ro.getObjX(), ro.getObjY(), ro.getObjW(), ro.getObjH());
        pen.drawString(text, ro.getObjX(), ro.getObjY()+ro.getObjH()-(ro.getObjH()/4));
    }

    @Override
    public void draw(Graphics pen, RenderObject ro, int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
    
}
