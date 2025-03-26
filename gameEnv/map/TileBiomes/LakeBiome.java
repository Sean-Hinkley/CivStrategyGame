package gameEnv.map.TileBiomes;

import gameEnv.ResourceHandlers.Resource;

public class LakeBiome extends TileBiome{

    public LakeBiome() {
            super("gameEnv\\map\\TileImgs\\Lake.png");
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public void setResources() {       
        this.addResource(1.4, Resource.gold); 
        this.addResource(3.2, Resource.production); 
        this.addResource(0.7, Resource.science); 
    }
    
}
