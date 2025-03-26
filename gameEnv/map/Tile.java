package gameEnv.map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import gameEnv.map.TileBiomes.SandBiome;
import gameEnv.map.TileBiomes.TileBiome;
import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.drawObject;
import renderWindow.GameEnvironment.renderable.renderObject.Image;
import renderWindow.GameEnvironment.renderable.renderObject.Rect;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class Tile extends RenderObject{
    private double scale = 1.0;
    private TileBiome biome;
    public Tile(int x, int y, KeyPressHandler k,drawObject d,TileBiome b) {
        super(x, y, 128,128,new Rect(),Color.blue,k,d);
        biome = b;
        BufferedImage img;
        
        try {

            img = ImageIO.read(new File(biome.toString()));
            
            Image s = new Image(img);
            this.setShape(s);

        } catch (IOException e) {
        }
    }

    public void draw(Graphics pen) {
        super.draw(pen);
        pen.setColor(Color.black);
        pen.drawRect(getObjX(), getObjY(), getObjW(), getObjH());
    }

    public void draw(Graphics pen, int x, int y) {
        this.getShape().draw(pen, this, x, y);
        pen.setColor(Color.black);
        pen.drawRect(x, y, getObjW(), getObjH());
    }
    public void clicked() {
        biome.harvest();
        System.out.println("X: " + getObjX());
        System.out.println("Y: " + getObjY());
    }
    
}
