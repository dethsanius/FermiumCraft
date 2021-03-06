package com.ThreeSquadIndie.FermiumCraft.blocks;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.blocks.
 */
public class BlockFermiumOre extends Block {
	
    public BlockFermiumOre(Material material){
        super(material);
        setHardness(4.0F); // 33% harder than diamond
        setBlockName("fermiumOre");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(FermiumCraft.tabFermium);
        setBlockTextureName(Reference.BlockFermiumOre);
    }
}
