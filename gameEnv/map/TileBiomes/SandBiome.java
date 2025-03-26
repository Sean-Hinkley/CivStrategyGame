package gameEnv.map.TileBiomes;

import gameEnv.ResourceHandlers.Resource;

public class SandBiome extends TileBiome{

    public SandBiome() {
            super("gameEnv\\map\\TileImgs\\Sand.png");
            //TODO Auto-generated constructor stub
        }
    
    public void setResources() {
        this.addResource(3.3, Resource.faith);        
        this.addResource(2.5, Resource.gold); 
        this.addResource(1.3, Resource.production); 
        this.addResource(1.6, Resource.science); 
    }
    
}
