package rtg.world.biome.realistic.vanilla;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import rtg.api.biome.BiomeConfig;
import rtg.world.biome.deco.DecoBoulder;
import rtg.world.biome.deco.DecoCactus;
import rtg.world.biome.deco.DecoDoubleGrass;
import rtg.world.biome.deco.DecoGrass;
import rtg.world.biome.deco.DecoTree;
import rtg.world.biome.deco.DecoTree.TreeCondition;
import rtg.world.biome.deco.DecoTree.TreeType;
import rtg.world.biome.deco.collection.DecoCollectionDesertRiver;
import rtg.world.gen.surface.vanilla.SurfaceVanillaSavannaPlateau;
import rtg.world.gen.terrain.vanilla.TerrainVanillaSavannaPlateau;

public class RealisticBiomeVanillaSavannaPlateau extends RealisticBiomeVanillaBase
{
    
    public static Block topBlock = BiomeGenBase.savannaPlateau.topBlock;
    public static Block fillerBlock = BiomeGenBase.savannaPlateau.fillerBlock;
    
    public RealisticBiomeVanillaSavannaPlateau(BiomeConfig config)
    {
    
        super(config, 
            BiomeGenBase.savannaPlateau,
            BiomeGenBase.river,
            new TerrainVanillaSavannaPlateau(true, 35f, 160f, 60f, 40f, 69f),
            new SurfaceVanillaSavannaPlateau(config, topBlock, (byte)0, fillerBlock, (byte)0, 0)
        );
        this.noLakes=true;
        
		/**
		 * ##################################################
		 * # DECORATIONS (ORDER MATTERS)
		 * ##################################################
		 */
    	
        this.addDecoCollection(new DecoCollectionDesertRiver());
        
		DecoBoulder decoBoulder1 = new DecoBoulder();
		decoBoulder1.boulderBlock = Blocks.cobblestone;
		decoBoulder1.maxY = 80;
		decoBoulder1.chance = 24;
		this.addDeco(decoBoulder1);
		
		DecoBoulder decoBoulder2 = new DecoBoulder();
		decoBoulder2.boulderBlock = Blocks.cobblestone;
		decoBoulder1.minY = 110;
		decoBoulder2.chance = 24;
		this.addDeco(decoBoulder2);
        
		DecoTree savannaTrees = new DecoTree();
		savannaTrees.strengthFactorForLoops = 3f;
		savannaTrees.treeType = TreeType.SAVANNA;
		savannaTrees.treeCondition = TreeCondition.RANDOM_CHANCE;
		savannaTrees.treeConditionChance = 3;
		savannaTrees.maxY = 160;
		this.addDeco(savannaTrees);
        
		DecoCactus decoCactus = new DecoCactus();
		decoCactus.maxY = 160;
		decoCactus.loops = 60;
		decoCactus.chance = 8;
        this.addDeco(decoCactus);
        
		DecoDoubleGrass decoDoubleGrass = new DecoDoubleGrass();
		decoDoubleGrass.maxY = 128;
		decoDoubleGrass.strengthFactor = 3f;
        this.addDeco(decoDoubleGrass);
        
		DecoGrass decoGrass = new DecoGrass();
		decoGrass.maxY = 128;
		decoGrass.strengthFactor = 10f;
        this.addDeco(decoGrass);
    }
}
