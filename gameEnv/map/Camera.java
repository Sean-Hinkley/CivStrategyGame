package gameEnv.map;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderObject.Shape;

public class Camera extends RenderObject{
    private Map map;
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
            
            if(s.equals("up")) {setObjY(getObjY()-5);System.out.println("hellosss");}
            if(s.equals("down")) {setObjY(getObjY()+5);}
            if(s.equals("left")) {setObjX(getObjX()-5);}
            if(s.equals("right")) {setObjX(getObjX()+5);}
        }
    }
    
}
