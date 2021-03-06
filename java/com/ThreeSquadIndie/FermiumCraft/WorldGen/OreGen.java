package com.ThreeSquadIndie.FermiumCraft.worldGen;

import com.ThreeSquadIndie.FermiumCraft.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    	switch(world.provider.dimensionId){
    	case -1:
    	    generateNether(world, random, chunkX * 16, chunkZ * 16);
    	    break;
    	case 0:
    	    generateSurface(world, random, chunkX * 16, chunkZ * 16);
    	    break;
    	case 1:
    	    generateEnd(world, random, chunkX * 16, chunkZ * 16);
    	    break;
    	}
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
		// TODO Auto-generated method stub

	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 10; k++) {
            int fermiumOreXCoord = chunkX + rand.nextInt(16);
            int fermiumOreYCoord = rand.nextInt(12);
            int fermiumOreZCoord = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModBlocks.blockFermiumOre, 13)).generate(world, rand, fermiumOreXCoord, fermiumOreYCoord, fermiumOreZCoord);
        }
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {

	}

}
