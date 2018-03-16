package ec.minecraftmod.medievalmechanics;

import ec.minecraftmod.medievalmechanics.common.init.Registration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

@Mod(modid = MedievalMechanics.MOD_ID, name= MedievalMechanics.MON_NAME, version= MedievalMechanics.VERSION, dependencies= MedievalMechanics.DEPENDENCIES)
public class MedievalMechanics {

    public static final String MOD_ID = "medieval_mechanics";
    public static final String MON_NAME = "Medieval Mechanics";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "";

    public static Random random = new Random();
    public static CreativeTabs MEDIEVAl_MECHANICS_TAB = new CreativeTabs(MOD_ID+":"+"creative_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Registration.blocksWithItems.iterator().next());
        }
    };

    @Mod.Instance(MOD_ID)
    public static MedievalMechanics instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(Registration.RegistrationHandler.class);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
