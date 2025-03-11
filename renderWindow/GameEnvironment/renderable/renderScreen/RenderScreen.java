package renderWindow.GameEnvironment.renderable.renderScreen;

import java.awt.Graphics;
import java.util.ArrayList;

import renderWindow.GameEnvironment.renderable.Renderable;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class RenderScreen extends Renderable{
    private ArrayList<RenderObject> render;
    public RenderScreen(int w, int h) {
        super(0, 0, w, h);
        render = new ArrayList<>();
    }

    public void draw(Graphics pen) {
        for(int draw = 0; draw < render.size(); draw++) {
            if(render.get(draw)!=null) {
                render.get(draw).draw(pen);
            }
        }
    }

    //render Methods
    public void addObj(RenderObject r) {render.add(r);}
    public void remObj(RenderObject r) {render.remove(r);}
}
