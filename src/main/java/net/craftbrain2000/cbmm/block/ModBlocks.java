package net.craftbrain2000.cbmm.block;

import net.craftbrain2000.cbmm.CBMM;
import net.craftbrain2000.cbmm.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CBMM.MOD_ID);

    //Stone Ores
    public static final RegistryObject<Block> BOURSSITE_ORE = registerBlock("bourssite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).noOcclusion().requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //Deepslate Ores

    //Misc
    public static final RegistryObject<Block> BLOODSTONE = registerBlock("bloodstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ASHNITE = registerBlock("ashnite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ASHNITE_BRICKS = registerBlock("ashnite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARUM = registerBlock("darum",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_DARUM = registerBlock("polished_darum",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> IRON_SUPPORTED_STONE = registerBlock("iron_supported_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SCIENCE_CUBE = registerBlock("science_cube",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> IRON_SUPPORT = registerBlock("iron_support",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //Colour "Vanilla" Stone
    public static final RegistryObject<Block> BLACK_COBBLESTONE = registerBlock("black_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_COBBLESTONE = registerBlock("blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_COBBLESTONE = registerBlock("brown_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_COBBLESTONE = registerBlock("cyan_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_COBBLESTONE = registerBlock("green_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREY_COBBLESTONE = registerBlock("grey_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_COBBLESTONE = registerBlock("light_blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GREY_COBBLESTONE = registerBlock("light_grey_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_COBBLESTONE = registerBlock("lime_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_COBBLESTONE = registerBlock("magenta_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_COBBLESTONE = registerBlock("orange_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_COBBLESTONE = registerBlock("pink_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_COBBLESTONE = registerBlock("purple_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_COBBLESTONE = registerBlock("red_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_COBBLESTONE = registerBlock("white_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_COBBLESTONE = registerBlock("yellow_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //Colour "Vanilla" Stone Slab

    //Colour "Vanilla" Stone Stairs

    //Colour "Vanilla" Wood
    public static final RegistryObject<Block> BLACK_WOOD = registerBlock("black_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_WOOD = registerBlock("blue_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_WOOD = registerBlock("brown_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_WOOD = registerBlock("cyan_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_WOOD = registerBlock("green_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREY_WOOD = registerBlock("grey_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_WOOD = registerBlock("light_blue_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GREY_WOOD = registerBlock("light_grey_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_WOOD = registerBlock("lime_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_WOOD = registerBlock("magenta_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_WOOD = registerBlock("orange_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_WOOD = registerBlock("pink_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_WOOD = registerBlock("purple_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_WOOD = registerBlock("red_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_WOOD = registerBlock("white_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_WOOD = registerBlock("yellow_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //Colour "Vanilla" Wood Stairs

    //Colour "Vanilla" Wood Slab

    //Colour Misc

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }



    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
