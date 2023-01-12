package fr.fiesta.fiestablocks.block;

import fr.fiesta.fiestablocks.FiestaBlocks;
import fr.fiesta.fiestablocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FiestaBlocks.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = createBlock("test_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    public static final RegistryObject<Block> STONE_VERTICAL_SLAB = createBlock("stone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STONE_TRAPDOOR = createBlock("stone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> GRANITE_VERTICAL_SLAB = createBlock("granite_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRANITE_TRAPDOOR = createBlock("granite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> POLISHED_GRANITE_VERTICAL_SLAB = createBlock("polished_granite_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_GRANITE_TRAPDOOR = createBlock("polished_granite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DIORITE_VERTICAL_SLAB = createBlock("diorite_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DIORITE_TRAPDOOR = createBlock("diorite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> POLISHED_DIORITE_VERTICAL_SLAB = createBlock("polished_diorite_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_DIORITE_TRAPDOOR = createBlock("polished_diorite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> ANDESITE_VERTICAL_SLAB = createBlock("andesite_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ANDESITE_TRAPDOOR = createBlock("andesite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> POLISHED_ANDESITE_VERTICAL_SLAB = createBlock("polished_andesite_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_ANDESITE_TRAPDOOR = createBlock("polished_andesite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_VERTICAL_SLAB = createBlock("cobbled_deepslate_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_TRAPDOOR = createBlock("cobbled_deepslate_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_VERTICAL_SLAB = createBlock("polished_deepslate_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_TRAPDOOR = createBlock("polished_deepslate_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> COBBLESTONE_VERTICAL_SLAB = createBlock("cobblestone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COBBLESTONE_TRAPDOOR = createBlock("cobblestone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> OAK_VERTICAL_SLAB = createBlock("oak_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SPRUCE_VERTICAL_SLAB = createBlock("spruce_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BIRCH_VERTICAL_SLAB = createBlock("birch_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JUNGLE_VERTICAL_SLAB = createBlock("jungle_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ACACIA_VERTICAL_SLAB = createBlock("acacia_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARK_OAK_VERTICAL_SLAB = createBlock("dark_oak_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRIMSON_VERTICAL_SLAB = createBlock("crimson_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WARPED_VERTICAL_SLAB = createBlock("warped_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> IRON_STAIRS = createBlock("iron_stairs", () -> new StairBlock(Blocks.IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> IRON_SLAB = createBlock("iron_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> IRON_VERTICAL_SLAB = createBlock("iron_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> COPPER_STAIRS = createBlock("copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, Blocks.COPPER_BLOCK.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COPPER_SLAB = createBlock("copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COPPER_VERTICAL_SLAB = createBlock("copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COPPER_TRAPDOOR = createBlock("copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> GOLD_STAIRS = createBlock("gold_stairs", () -> new StairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GOLD_SLAB = createBlock("gold_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GOLD_VERTICAL_SLAB = createBlock("gold_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GOLD_TRAPDOOR = createBlock("gold_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DIAMOND_STAIRS = createBlock("diamond_stairs", () -> new StairBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DIAMOND_SLAB = createBlock("diamond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DIAMOND_VERTICAL_SLAB = createBlock("diamond_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DIAMOND_TRAPDOOR = createBlock("diamond_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> NETHERITE_STAIRS = createBlock("netherite_stairs", () -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERITE_SLAB = createBlock("netherite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERITE_VERTICAL_SLAB = createBlock("netherite_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERITE_TRAPDOOR = createBlock("netherite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> EXPOSED_COPPER_STAIRS = createBlock("exposed_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, Blocks.EXPOSED_COPPER.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EXPOSED_COPPER_SLAB = createBlock("exposed_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EXPOSED_COPPER_VERTICAL_SLAB = createBlock("exposed_copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EXPOSED_COPPER_TRAPDOOR = createBlock("exposed_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> WEATHERED_COPPER_STAIRS = createBlock("weathered_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, Blocks.WEATHERED_COPPER.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WEATHERED_COPPER_SLAB = createBlock("weathered_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WEATHERED_COPPER_VERTICAL_SLAB = createBlock("weathered_copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WEATHERED_COPPER_TRAPDOOR = createBlock("weathered_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> OXIDIZED_COPPER_STAIRS = createBlock("oxidized_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, Blocks.OXIDIZED_COPPER.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OXIDIZED_COPPER_SLAB = createBlock("oxidized_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OXIDIZED_COPPER_VERTICAL_SLAB = createBlock("oxidized_copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OXIDIZED_COPPER_TRAPDOOR = createBlock("oxidized_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CUT_COPPER_VERTICAL_SLAB = createBlock("cut_copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_COPPER_TRAPDOOR = createBlock("cut_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_VERTICAL_SLAB = createBlock("exposed_cut_copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_TRAPDOOR = createBlock("exposed_cut_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_VERTICAL_SLAB = createBlock("weathered_cut_copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_TRAPDOOR = createBlock("weathered_cut_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_VERTICAL_SLAB = createBlock("oxidized_cut_copper_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_TRAPDOOR = createBlock("oxidized_cut_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> LAPIS_STAIRS = createBlock("lapis_stairs", () -> new StairBlock(Blocks.LAPIS_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LAPIS_SLAB = createBlock("lapis_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LAPIS_VERTICAL_SLAB = createBlock("lapis_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LAPIS_TRAPDOOR = createBlock("lapis_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> SANDSTONE_VERTICAL_SLAB = createBlock("sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDSTONE_TRAPDOOR = createBlock("sandstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = createBlock("cut_sandstone_stairs", () -> new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_SANDSTONE_VERTICAL_SLAB = createBlock("cut_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_SANDSTONE_TRAPDOOR = createBlock("cut_sandstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> SMOOTH_QUARTZ_VERTICAL_SLAB = createBlock("smooth_quartz_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_TRAPDOOR = createBlock("smooth_quartz_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = createBlock("smooth_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_TRAPDOOR = createBlock("smooth_red_sandstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_VERTICAL_SLAB = createBlock("smooth_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_TRAPDOOR = createBlock("smooth_sandstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = createBlock("smooth_stone_stairs", () -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_STONE_VERTICAL_SLAB = createBlock("smooth_stone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_STONE_TRAPDOOR = createBlock("smooth_stone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> BRICK_VERTICAL_SLAB = createBlock("brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BRICK_TRAPDOOR = createBlock("brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_VERTICAL_SLAB = createBlock("mossy_cobblestone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_TRAPDOOR = createBlock("mossy_cobblestone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> PURPUR_VERTICAL_SLAB = createBlock("purpur_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPUR_TRAPDOOR = createBlock("purpur_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> STONE_BRICK_VERTICAL_SLAB = createBlock("stone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STONE_BRICK_TRAPDOOR = createBlock("stone_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> MOSSY_STONE_BRICK_VERTICAL_SLAB = createBlock("mossy_stone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_STONE_BRICK_TRAPDOOR = createBlock("mossy_stone_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = createBlock("cracked_stone_brick_stairs", () -> new StairBlock(Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = createBlock("cracked_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_VERTICAL_SLAB = createBlock("cracked_stone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_TRAPDOOR = createBlock("cracked_stone_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DEEPSLATE_BRICK_VERTICAL_SLAB = createBlock("deepslate_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_BRICK_TRAPDOOR = createBlock("deepslate_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = createBlock("cracked_deepslate_brick_stairs", () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = createBlock("cracked_deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_VERTICAL_SLAB = createBlock("cracked_deepslate_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_TRAPDOOR = createBlock("cracked_deepslate_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DEEPSLATE_TILE_VERTICAL_SLAB = createBlock("deepslate_tile_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_TILE_TRAPDOOR = createBlock("deepslate_tile_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = createBlock("cracked_deepslate_tile_stairs", () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = createBlock("cracked_deepslate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_VERTICAL_SLAB = createBlock("cracked_deepslate_tile_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_TRAPDOOR = createBlock("cracked_deepslate_tile_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> NETHER_BRICK_VERTICAL_SLAB = createBlock("nether_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHER_BRICK_TRAPDOOR = createBlock("nether_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = createBlock("cracked_nether_brick_stairs", () -> new StairBlock(Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = createBlock("cracked_nether_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_VERTICAL_SLAB = createBlock("cracked_nether_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_TRAPDOOR = createBlock("cracked_nether_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> END_STONE_BRICK_VERTICAL_SLAB = createBlock("end_stone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> END_STONE_BRICK_TRAPDOOR = createBlock("end_stone_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> EMERALD_STAIRS = createBlock("emerald_stairs", () -> new StairBlock(Blocks.EMERALD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EMERALD_SLAB = createBlock("emerald_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EMERALD_VERTICAL_SLAB = createBlock("emerald_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EMERALD_TRAPDOOR = createBlock("emerald_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> QUARTZ_VERTICAL_SLAB = createBlock("quartz_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> QUARTZ_TRAPDOOR = createBlock("quartz_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> PRISMARINE_VERTICAL_SLAB = createBlock("prismarine_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PRISMARINE_TRAPDOOR = createBlock("prismarine_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> PRISMARINE_BRICK_VERTICAL_SLAB = createBlock("prismarine_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PRISMARINE_BRICK_TRAPDOOR = createBlock("prismarine_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DARK_PRISMARINE_VERTICAL_SLAB = createBlock("dark_prismarine_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARK_PRISMARINE_TRAPDOOR = createBlock("dark_prismarine_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> RED_SANDSTONE_VERTICAL_SLAB = createBlock("red_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_SANDSTONE_TRAPDOOR = createBlock("red_sandstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = createBlock("cut_red_sandstone_stairs", () -> new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_VERTICAL_SLAB = createBlock("cut_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_TRAPDOOR = createBlock("cut_red_sandstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> RED_NETHER_BRICK_VERTICAL_SLAB = createBlock("red_nether_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_NETHER_BRICK_TRAPDOOR = createBlock("red_nether_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> BLACKSTONE_VERTICAL_SLAB = createBlock("blackstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACKSTONE_TRAPDOOR = createBlock("blackstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_VERTICAL_SLAB = createBlock("polished_blackstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TRAPDOOR = createBlock("polished_blackstone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = createBlock("polished_blackstone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_TRAPDOOR = createBlock("polished_blackstone_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = createBlock("cracked_polished_blackstone_brick_stairs", () -> new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = createBlock("cracked_polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = createBlock("cracked_polished_blackstone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR = createBlock("cracked_polished_blackstone_brick_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    private static <T extends Block> RegistryObject<T> createBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        createBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> createBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        createBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> createBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<Item> createBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

}
