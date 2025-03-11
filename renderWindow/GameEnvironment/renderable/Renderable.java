package renderWindow.GameEnvironment.renderable;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;



public abstract class Renderable {
    String title;
    private int objX;
    private int objY;
    private int objW;
    private int objH;
    private Script script;

    public Renderable(int x, int y, int w, int h) {setShape(x, y, w, h);}

    public void draw(Graphics pen) {}
    public void update() {}
    public void inputs() {}

    //Shape Getters and Setters
    public void setShape(int x, int y, int w, int h) {
        setObjX(x);
        setObjY(y);
        setObjW(w);
        setObjH(h);

    }
    public void setObjX(int x) {objX = x;}
    public int getObjX() {return objX;}

    public void setObjY(int y) {objY = y;}
    public int getObjY() {return objY;}

    public void setObjW(int w) {objW = w;}
    public int getObjW() {return objW;}

    public void setObjH(int h) {objH = h;}
    public int getObjH() {return objH;}

    //Script Methods
    public  void start() {if(script!=null) script.start();}

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
