package gameEnv.map.TileBiomes;

import gameEnv.ResourceHandlers.Resource;
import gameEnv.ResourceHandlers.ResourceHandler;

public abstract class TileBiome {
    
    private ResourceHandler resources;

    public TileBiome() {
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
}
