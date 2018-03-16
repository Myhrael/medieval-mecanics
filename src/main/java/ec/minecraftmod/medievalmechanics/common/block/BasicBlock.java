package ec.minecraftmod.medievalmechanics.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block{

    public BasicBlock(String name, Material mat, CreativeTabs tab, float hardness, float resistance, String tool, int harvest){
        this(name, mat, tab, hardness, resistance);
        setHarvestLevel(tool, harvest);
    }

    public BasicBlock(String name, Material mat, CreativeTabs tab, float hardness, float resistance, float light){
        this(name, mat, tab, hardness, resistance);
        setLightLevel(light);
    }

    public BasicBlock(String name, Material mat, CreativeTabs tab, float hardness, float resistance){
        super(mat);
        setRegistryName(name);
        setUnlocalizedName(getRegistryName().toString());
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(tab);
    }

}
