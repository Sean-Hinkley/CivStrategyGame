package gameEnv.map.TileBiomes;

import gameEnv.ResourceHandlers.Resource;
import gameEnv.map.Tile;

public class GrassBiome extends TileBiome{

    public GrassBiome() {
            super("gameEnv\\map\\TileImgs\\Grass.png");
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public void setResources() {
        this.addResource(3.4, Resource.production); 
        this.addResource(5.3, Resource.science); 
    }
    
}
