package renderWindow.GameEnvironment;

import java.util.ArrayList;


import renderWindow.Window;
import renderWindow.GameEnvironment.renderable.Script;
import renderWindow.GameEnvironment.renderable.renderScreen.RenderScreen;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class GameEnvironment {
    String title;
    private Script script;
    private int objW;
    private int objH;
    private ArrayList<RenderScreen> render;
    private Window win;
    public GameEnvironment(int w, int h) {
        objW = w;
        objH = h;
        render = new ArrayList<RenderScreen>();
        win = new Window(objW,objH,this);
    }

    public void draw(Graphics pen) {
        for(int draw = 0; draw < render.size(); draw++) {
            if(render.get(draw)!=null) {
                render.get(draw).draw(pen);
            }
        }
    }

    public void run() {
        win.run();
    }

    public void update() {

    }

    public void inputs() {

    }

    public void addRenderable(RenderScreen r) {render.add(r);}
    public void removeRenderable(RenderScreen r) {render.remove(r);}

    public void setScript(Script s) { script = s;}
    public Script getScript() { return script;}


    public void mouseWheelMoved(MouseWheelEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    
}
