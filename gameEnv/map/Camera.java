package gameEnv.map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderObject.Shape;

public class Camera extends RenderObject{
    private Map map;
    private int size = 128;
    private double scale = 1.0;
    public Camera(int x, int y, int w, int h, KeyPressHandler k, Map m) {
        super(x, y, w, h, null, null,k);
        map = m;
    }
    public void draw(Graphics pen) {
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
        int tilex = x/(int)(size*scale);//x coordinates in tile array position
        int tiley = y/(int)(size*scale);//y coordinates in tile array position
        int tilew = (int)(getObjW()/(scale*size));//Width of screen by tiles
        int tileh = (int)(getObjH()/(scale*size));//Height of screen by tiles
        int clickx = (x-getOffsetX()+getObjX())/128;//position x where you clicked measured by tiles
        int clicky = (y-getOffsetX()+getObjY())/128;//position y where you clicked measured by tiles
        Tile[][] tile = map.getView(tilex,tiley,tilew,tileh);
        Tile t = map.getTile(clickx, clicky);//gets tile from map
        if(t!=null) {
            t.clicked();//sends signal that its been clicked
        }
         
    }

    public int getOffsetX() {
        return (int)(this.getObjX()%(size*scale));
    }

    public int getOffsetY() {
        return (int)(this.getObjY()%(size*scale));
    }
    
}
