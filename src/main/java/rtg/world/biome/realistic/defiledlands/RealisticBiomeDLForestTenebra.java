package rtg.world.biome.realistic.defiledlands;

import net.minecraft.world.biome.Biome;
import rtg.api.world.RTGWorld;
import rtg.api.world.terrain.TerrainBase;


public class RealisticBiomeDLForestTenebra extends RealisticBiomeDLBase {

    public RealisticBiomeDLForestTenebra(Biome biome) {

        super(biome);
    }

    @Override
    public void initConfig() {

    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainVanillaForest();
    }

    public static class TerrainVanillaForest extends TerrainBase {

        private float hillStrength = 10f;// this needs to be linked to the

        public TerrainVanillaForest() {

        }

        @Override
        public float generateNoise(RTGWorld rtgWorld, int x, int y, float border, float river) {

            groundNoise = groundNoise(x, y, groundVariation, rtgWorld);

            float m = hills(x, y, hillStrength, rtgWorld);

            float floNoise = 65f + groundNoise + m;

            return riverized(floNoise, river);
        }
    }
}
