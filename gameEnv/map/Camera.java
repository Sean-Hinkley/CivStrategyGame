package gameEnv.map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.drawObject;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderObject.Shape;

public class Camera extends RenderObject{
    private Map map;
    private int size = 128;
    private double scale = 1.0;
    public Camera(int x, int y, int w, int h, KeyPressHandler k, Map m,drawObject d) {
        super(x, y, w, h, null, null,k,d);
        map = m;
    }
    public void draw(Graphics pen) {
        pen.setColor(Color.black);
        pen.fillRect(0, 0, getObjW(), getObjH());
        map.drawCutArea(pen, getObjX()-125, getObjY()-100, getObjW()+500, getObjH()+400);
    }
    public void setKeys() {
        this.getKeys().addKey(87, "up");
        this.getKeys().addKey(83, "down");
        this.getKeys().addKey(65, "left");
        this.getKeys().addKey(68, "right");
    }
    public void keyActions() {
        ArrayList<String> k = this.getKeys().getAllPressed();
        for(String s: k) {        
            if(s.equals("up")) {setObjY(getObjY()-5);}
            if(s.equals("down")) {setObjY(getObjY()+5);}
            if(s.equals("left")) {setObjX(getObjX()-5);}
            if(s.equals("right")) {setObjX(getObjX()+5);}
        }
    }
    public void mouseClicked(MouseEvent e) {
        clickCollision(e.getX()-8, e.getY()-32);
    }
    public void clickCollision(int x, int y) {
        int tilex = map.getTileX(x);
        int leftX = getObjX() % (int)(size*scale);
        int tiley = map.getTileY(y);
        int leftY = getObjY() % (int)(size*scale);
        int tilew = (int)(getObjW()/(scale*size));
        int tileh = (int)(getObjH()/(scale*size));
        Tile[][] view = map.getView(tilex, tiley, tilew, tileh);
        int clickx = ((x-leftX+getObjX())/128);
        int clicky = ((y-leftY+getObjY())/128);
        System.out.println("ClickX: " + clickx);
        System.out.println("ClickY: " + clicky);
         
    }

    public int getOffsetX() {
        return (int)(this.getObjX()%(size*scale));
    }

    public int getOffsetY() {
        return (int)(this.getObjY()%(size*scale));
    }
    
}
