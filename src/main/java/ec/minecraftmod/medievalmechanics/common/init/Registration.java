package ec.minecraftmod.medievalmechanics.common.init;

import com.google.common.collect.Sets;
import ec.minecraftmod.medievalmechanics.MedievalMechanics;
import ec.minecraftmod.medievalmechanics.common.block.BasicBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.*;

public class Registration {
    public static final Set<Block> blocksWithItems = getSetFromList(Arrays.asList(
            new BasicBlock("copper_ore", Material.ROCK, MedievalMechanics.MEDIEVAl_MECHANICS_TAB, 4, 8, "pickaxe", 1),
            new BasicBlock("tin_ore", Material.ROCK, MedievalMechanics.MEDIEVAl_MECHANICS_TAB, 4, 8, "pickaxe", 1)
    ));
    public static final Set<Block> blocks = getSetFromList(Arrays.asList(

    ));
    public static final Set<Item> items = getSetFromList(Arrays.asList(

    ));

    private static <E> Set<E> getSetFromList(Collection<E> objects){
        Set<E> s = new HashSet<>();
        s.addAll(objects);

        return s;
    }


    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            Sets.union(Registration.blocks, Registration.blocksWithItems).forEach(block -> {
                event.getRegistry().register(block);
            });
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            Set<Item> itemsBlock = new HashSet<>();
            blocksWithItems.forEach(block -> itemsBlock.add(
                    new ItemBlock(block).setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName())
                    ));

            Sets.union(itemsBlock, items).forEach(item -> event.getRegistry().register(item));
        }

        @SubscribeEvent
        public static void registerModels(final ModelRegistryEvent event){
            Sets.union(Registration.blocks, Registration.blocksWithItems).forEach(block -> {
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), null));
            });
        }
    }
}
