package ec.minecraftmod.medievalmecanics;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Random;

@Mod(modid = MedievalMecanics.MOD_ID, name=MedievalMecanics.MON_NAME, version=MedievalMecanics.VERSION, dependencies=MedievalMecanics.DEPENDENCIES)
public class MedievalMecanics {

    public static final String MOD_ID = "medievalmecanics";
    public static final String MON_NAME = "Medieval Mecanics";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "";

    public static Random random = new Random();

    @Mod.Instance(MOD_ID)
    public static MedievalMecanics instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
