package rtg.world.biome.realistic.enhancedbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import rtg.config.ConfigEB;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.BiomeGenManager;
import rtg.world.gen.surface.enhancedbiomes.SurfaceEBPineForest;
import rtg.world.gen.terrain.enhancedbiomes.TerrainEBPineForest;

public class RealisticBiomeEBPineForest extends RealisticBiomeEBBase
{	
	public RealisticBiomeEBPineForest(BiomeGenBase ebBiome)
	{
		super(
			ebBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, BiomeBase.Climate.COLD),
			new TerrainEBPineForest(),
			new SurfaceEBPineForest(ebBiome.topBlock, ebBiome.fillerBlock, Blocks.stone, Blocks.cobblestone)
		);
		
		this.setRealisticBiomeName("EB Pine Forest");
		BiomeGenManager.addFrozenBiome(this, ConfigEB.weightEBPineForest);
	}
}
