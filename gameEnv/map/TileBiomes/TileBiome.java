package gameEnv.map.TileBiomes;

import gameEnv.ResourceHandlers.Resource;
import gameEnv.ResourceHandlers.ResourceHandler;

public abstract class TileBiome {
    
    private ResourceHandler resources;
    private String imgstr;
    public TileBiome(String s) {
        imgstr = s;
        resources = new ResourceHandler();
        setResources();
    }

    public abstract void setResources();

    public void harvest() {
        resources.harvest();
    }

    public void addResource(double a, Resource r) {
        resources.addResource(a, r);
    }

    public String toString() {return imgstr;}
}
