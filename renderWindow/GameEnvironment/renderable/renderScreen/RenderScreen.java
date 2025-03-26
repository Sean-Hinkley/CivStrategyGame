package renderWindow.GameEnvironment.renderable.renderScreen;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

//import org.w3c.dom.events.MouseEvent;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.renderable.Renderable;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class RenderScreen extends Renderable{
    private ArrayList<RenderObject> render;
    public RenderScreen(int w, int h, KeyPressHandler k) {
        super(0, 0, w, h, k);
        render = new ArrayList<>();
    }

    public void draw(Graphics pen) {
        for(int draw = 0; draw < render.size(); draw++) {
            if(render.get(draw)!=null) {
                render.get(draw).draw(pen);
            }
        }
    }

    public void update() {
        keyActions();
        for(RenderObject o: render) {
            
            o.update();
        }
    }

    public void mouseClicked(MouseEvent e) {
        for(RenderObject r: render) {
            if(r!=null) {
                r.mouseClicked(e);
            }
        }
    }

    //render Methods
    public void addObj(RenderObject r) {render.add(r);}
    public void remObj(RenderObject r) {render.remove(r);}
}
