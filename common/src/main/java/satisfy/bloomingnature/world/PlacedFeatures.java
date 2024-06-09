package satisfy.bloomingnature.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import satisfy.bloomingnature.util.BloomingNatureIdentifier;

public class PlacedFeatures {


    public static final ResourceKey<PlacedFeature> STONE_SLABS = registerKey("terrain/stone_slabs");
    public static final ResourceKey<PlacedFeature> STONE_MOUND = registerKey("terrain/stone_mound");
    public static final ResourceKey<PlacedFeature> STONE_PILLARS = registerKey("terrain/stone_pillars");
    public static final ResourceKey<PlacedFeature> STONE_CLIFFS = registerKey("terrain/stone_cliffs");
    public static final ResourceKey<PlacedFeature> STONE_BOULDER = registerKey("terrain/stone_boulder");
    public static final ResourceKey<PlacedFeature> GRAVEL_BEACH = registerKey("terrain/gravel_beach");
    public static final ResourceKey<PlacedFeature> COBBLESTONE_BEACH = registerKey("terrain/cobblestone_beach");
    public static final ResourceKey<PlacedFeature> COBBLESTONE_BEACH_MOSSY = registerKey("terrain/cobblestone_beach_mossy");
    public static final ResourceKey<PlacedFeature> JUNGLE_FLOWERS = registerKey("jungle_flowers");
    public static final ResourceKey<PlacedFeature> QUICKSAND = registerKey("terrain/quicksand");
    public static final ResourceKey<PlacedFeature> TRAVERTIN = registerKey("terrain/ore_travertin");
    public static final ResourceKey<PlacedFeature> FLOWER_DEFAULT = registerMCKey("flower_default");

    public static final ResourceKey<PlacedFeature> LAVA_LAKE_UNDERGROUND = registerMCKey("lake_lava_underground");
    public static final ResourceKey<PlacedFeature> LAVA_LAKE_SURFACE = registerMCKey("lake_lava_surface");

    public static final ResourceKey<PlacedFeature> FAN_PALM_TREE = registerKey("beach_fan_palm");
    public static final ResourceKey<PlacedFeature> BEACH_FLOWERS = registerKey("beach_flowers");

    public static final ResourceKey<PlacedFeature> PLAINS_TREES = registerMCKey("trees_plains");
    public static final ResourceKey<PlacedFeature> PLAINS_FLOWERS = registerMCKey("flower_plains");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_TREES = registerKey("plains_trees");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_FLOWERS = registerKey("plains_flowers");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_GRASS = registerKey("plains_grass_patch");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_MOUND = registerKey("plains_stone_mound");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_STONE_BOULDER = registerKey("plains_stone_boulder");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_GRAVEL_BEACH = registerKey("plains_gravel_beach");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_TRAVERTIN = registerKey("plains_ore_travertin");
    public static final ResourceKey<PlacedFeature> PLAINS_BN_STONE_SLABS = registerKey("plains_stone_slabs");
    public static final ResourceKey<PlacedFeature> SUNFLOWER_PLAINS_BN_TREES = registerKey("sunflower_plains_trees");
    public static final ResourceKey<PlacedFeature> SUNFLOWER_PLAINS_BN_FLOWERS = registerKey("sunflower_plains_flowers");
    public static final ResourceKey<PlacedFeature> RIVER_TREES = registerMCKey("trees_water");
    public static final ResourceKey<PlacedFeature> RIVER_FLOWERS = registerMCKey("flower_default");
    public static final ResourceKey<PlacedFeature> RIVER_BN_TREES = registerKey("river_trees");
    public static final ResourceKey<PlacedFeature> RIVER_BN_GRASS = registerKey("river_grass_patch");
    public static final ResourceKey<PlacedFeature> RIVER_BN_MOUND = registerKey("river_stone_mound");
    public static final ResourceKey<PlacedFeature> RIVER_BN_STONE_BOULDER = registerKey("river_stone_boulder");
    public static final ResourceKey<PlacedFeature> RIVER_BN_GRAVEL_BEACH = registerKey("river_gravel_beach");
    public static final ResourceKey<PlacedFeature> RIVER_BN_TRAVERTIN = registerKey("river_ore_travertin");
    public static final ResourceKey<PlacedFeature> RIVER_BN_STONE_SLABS = registerKey("river_stone_slabs");
    public static final ResourceKey<PlacedFeature> ASPEN_TREES = registerMCKey("birch_tall");
    public static final ResourceKey<PlacedFeature> ASPEN_FLOWERS = registerMCKey("forest_flowers");
    public static final ResourceKey<PlacedFeature> ASPEN_BN_TREES = registerKey("aspen_trees");
    public static final ResourceKey<PlacedFeature> ASPEN_BN_FALLEN = registerKey("aspen_tree_fallen");
    public static final ResourceKey<PlacedFeature> ASPEN_BN_FLOWERS = registerKey("aspen_flowers");
    public static final ResourceKey<PlacedFeature> ASPEN_BN_GRASS = registerKey("aspen_grass_patch");
    public static final ResourceKey<PlacedFeature> ASPEN_BN_STONE_SLABS = registerKey("aspen_stone_slabs");
    public static final ResourceKey<PlacedFeature> BIRCH_TREES = registerMCKey("trees_birch");
    public static final ResourceKey<PlacedFeature> BIRCH_FLOWERS = registerMCKey("forest_flowers");
    public static final ResourceKey<PlacedFeature> BIRCH_BN_TREES = registerKey("birch_trees");
    public static final ResourceKey<PlacedFeature> BIRCH_BN_FALLEN = registerKey("birch_fallen");
    public static final ResourceKey<PlacedFeature> BIRCH_BN_FLOWERS = registerKey("birch_flowers");
    public static final ResourceKey<PlacedFeature> BIRCH_BN_GRASS = registerKey("birch_grass_patch");
    public static final ResourceKey<PlacedFeature> BIRCH_BN_STONE_SLABS = registerKey("birch_stone_slabs");
    public static final ResourceKey<PlacedFeature> FOREST_TREES = registerMCKey("trees_birch_and_oak");
    public static final ResourceKey<PlacedFeature> FOREST_FLOWERS = registerMCKey("forest_flowers");
    public static final ResourceKey<PlacedFeature> FOREST_BN_TREES = registerKey("forest_trees");
    public static final ResourceKey<PlacedFeature> FOREST_BN_FALLEN = registerKey("forest_log_fallen");
    public static final ResourceKey<PlacedFeature> FOREST_BN_FLOWERS = registerKey("forest_flowers");
    public static final ResourceKey<PlacedFeature> FOREST_BN_GRASS = registerKey("forest_grass_patch");
    public static final ResourceKey<PlacedFeature> FOREST_BN_STONE_BOULDER = registerKey("forest_stone_boulder");
    public static final ResourceKey<PlacedFeature> FOREST_BN_STONE_SLABS = registerKey("forest_stone_slabs");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_TREES = registerMCKey("trees_flower_forest");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_FLOWER_FLOWER = registerMCKey("flower_flower_forest");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_FLOWER = registerMCKey("flower_forest_flowers");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_BN_TREES = registerKey("forest_trees");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_BN_FALLEN = registerKey("forest_log_fallen");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_BN_FLOWERS = registerKey("flower_forest_flowers");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_BN_GRASS = registerKey("flower_forest_grass_patch");
    public static final ResourceKey<PlacedFeature> FLOWER_FOREST_BN_STONE_SLABS = registerKey("flower_forest_stone_slabs");
    public static final ResourceKey<PlacedFeature> CHERRY_TREES = registerMCKey("trees_cherry");
    public static final ResourceKey<PlacedFeature> CHERRY_FLOWERS = registerMCKey("flower_cherry");
    public static final ResourceKey<PlacedFeature> CHERRY_BN_TREES = registerKey("cherry_grove_trees");
    public static final ResourceKey<PlacedFeature> CHERRY_BN_FLOWERS = registerKey("cherry_grove_flowers");
    public static final ResourceKey<PlacedFeature> SNOWY_PLAINS_TREES = registerMCKey("trees_snowy");
    public static final ResourceKey<PlacedFeature> SNOWY_PLAINS_FLOWERS = registerMCKey("flower_default");
    public static final ResourceKey<PlacedFeature> SNOWY_PLAINS_BN_TREES = registerKey("snowy_plains_trees");
    public static final ResourceKey<PlacedFeature> SNOWY_PLAINS_BN_ADDITIONAL_TREES = registerKey("snowy_plains_additional_trees");
    public static final ResourceKey<PlacedFeature> SNOWY_SLOPES_STONE_BOULDER = registerKey("snowy_plains_stone_boulder");
    public static final ResourceKey<PlacedFeature> SNOWY_SLOPES_STONE_MOUND = registerKey("snowy_plains_stone_mound");
    public static final ResourceKey<PlacedFeature> SNOWY_SLOPES_GRAVEL_BEACH = registerKey("snowy_plains_gravel_beach");
    public static final ResourceKey<PlacedFeature> SNOWY_SLOPES_STONE_SLABS = registerKey("snowy_plains_stone_slabs");
    public static final ResourceKey<PlacedFeature> SNOWY_TAIGA_TREES = registerMCKey("trees_taiga");
    public static final ResourceKey<PlacedFeature> SNOWY_TAIGA_BN_TREES = registerKey("snowy_taiga_trees");
    public static final ResourceKey<PlacedFeature> SNOWY_TAIGA_BN_STONE_BOULDER = registerKey("snowy_taiga_stone_boulder");
    public static final ResourceKey<PlacedFeature> SNOWY_TAIGA_BN_STONE_MOUND = registerKey("snowy_taiga_stone_mound");
    public static final ResourceKey<PlacedFeature> SNOWY_TAIGA_BN_GRAVEL_BEACH = registerKey("snowy_taiga_gravel_beach");
    public static final ResourceKey<PlacedFeature> SNOWY_TAIGA_BN_STONE_SLABS = registerKey("snowy_taiga_stone_slabs");

    public static final ResourceKey<PlacedFeature> SWAMP_TREES = registerMCKey("trees_swamp");
    public static final ResourceKey<PlacedFeature> SWAMP_FLOWERS = registerMCKey("flower_swamp");
    public static final ResourceKey<PlacedFeature> SWAMP_GRASS = registerMCKey("patch_grass_normal");
    public static final ResourceKey<PlacedFeature> SWAMP_WATER_BASIN = registerKey("swamp_water_basin");
    public static final ResourceKey<PlacedFeature> SWAMP_MARSH_BASIN = registerKey("swamp_marsh_basin");
    public static final ResourceKey<PlacedFeature> SWAMP_FLOATING_LEAVES = registerKey("swamp_floating_leaves");
    public static final ResourceKey<PlacedFeature> SWAMP_MUD = registerKey("swamp_mud");
    public static final ResourceKey<PlacedFeature> SWAMP_SWAMP_MUD = registerKey("swamp_additional_mud");
    public static final ResourceKey<PlacedFeature> SWAMP_MARSH = registerKey("swamp_marsh");
    public static final ResourceKey<PlacedFeature> SWAMP_BN_TREES = registerKey("swamp_trees");
    public static final ResourceKey<PlacedFeature> SWAMP_VEGETATION = registerKey("swamp_vegetation");
    public static final ResourceKey<PlacedFeature> SWAMP_CATTAILS = registerKey("swamp_cattails");
    public static final ResourceKey<PlacedFeature> SWAMP_REED = registerKey("swamp_reed");
    public static final ResourceKey<PlacedFeature> SWAMP_BN_GRASS = registerKey("swamp_grass_patch");
    public static final ResourceKey<PlacedFeature> SWAMP_BN_FLOWERS = registerKey("swamp_flowers");

    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_WATER_BASIN = registerKey("mangrove_swamp_water_basin");
    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_MARSH_BASIN = registerKey("mangrove_swamp_marsh_basin");
    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_FLOATING_LEAVES = registerKey("mangrove_swamp_floating_leaves");
    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_MUD = registerKey("mangrove_swamp_mud");
    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_SWAMP_MUD = registerKey("mangrove_swamp_additional_mud");
    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_VEGETATION = registerKey("mangrove_swamp_vegetation");
    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_CATTAILS = registerKey("mangrove_swamp_cattails");
    public static final ResourceKey<PlacedFeature> MANGROVE_SWAMP_REED = registerKey("mangrove_swamp_reed");



    public static final ResourceKey<PlacedFeature> TAIGA_LARGE_FERN = registerMCKey("patch_large_fern");
    public static final ResourceKey<PlacedFeature> TAIGA_TREES = registerMCKey("trees_taiga");
    public static final ResourceKey<PlacedFeature> TAIGA_FLOWERS = registerMCKey("flower_default");
    public static final ResourceKey<PlacedFeature> TAIGA_GRASS = registerMCKey("patch_grass_taiga_2");
    public static final ResourceKey<PlacedFeature> TAIGA_FOREST_MOSS = registerKey("terrain/forest_moss");
    public static final ResourceKey<PlacedFeature> TAIGA_SPRUCE_TREES = registerKey("taiga_spruce_trees");
    public static final ResourceKey<PlacedFeature> TAIGA_SPRUCE_FALLEN = registerKey("taiga_spruce_fallen");
    public static final ResourceKey<PlacedFeature> TAIGA_GRASS_PATCH = registerKey("taiga_grass_patch");
    public static final ResourceKey<PlacedFeature> TAIGA_BN_FLOWERS = registerKey("taiga_flowers");

    public static final ResourceKey<PlacedFeature> OLD_GROWTH_SPRUCE_TAIGA_LARGE_FERN = registerMCKey("patch_large_fern");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_SPRUCE_TAIGA_TREES = registerMCKey("trees_old_growth_pine_taiga");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_SPRUCE_TAIGA_FLOWERS = registerMCKey("flower_default");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_SPRUCE_TAIGA_GRASS = registerMCKey("patch_grass_taiga");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_SPRUCE_TAIGA_BN_TREES = registerKey("old_growth_spruce_trees");

    public static final ResourceKey<PlacedFeature> OLD_GROWTH_PINE_TAIGA_LARGE_FERN = registerMCKey("patch_large_fern");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_PINE_TAIGA_TREES = registerMCKey("trees_old_growth_pine_taiga");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_PINE_TAIGA_FLOWERS = registerMCKey("flower_default");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_PINE_TAIGA_GRASS = registerMCKey("patch_grass_taiga");
    public static final ResourceKey<PlacedFeature> LARCH_TREES = registerKey("larch_trees");
    public static final ResourceKey<PlacedFeature> LARCH_FALLEN = registerKey("larch_fallen");
    public static final ResourceKey<PlacedFeature> LARCH_GRASS_PATCH = registerKey("larch_grass_patch");
    public static final ResourceKey<PlacedFeature> LARCH_FLOWERS = registerKey("larch_flowers");

    public static final ResourceKey<PlacedFeature> DARK_FOREST_VEGETATION = registerMCKey("dark_forest_vegetation");
    public static final ResourceKey<PlacedFeature> DARK_FOREST_TREES = registerKey("dark_forest_trees");
    public static final ResourceKey<PlacedFeature> DARK_FOREST_GRASS_PATCH = registerKey("dark_forest_grass_patch");
    public static final ResourceKey<PlacedFeature> DARK_FOREST_TREE_FALLEN = registerKey("dark_forest_tree_fallen");

    public static final ResourceKey<PlacedFeature> TREES_SAVANNA = registerMCKey("trees_savanna");
    public static final ResourceKey<PlacedFeature> PATCH_GRASS_SAVANNA = registerMCKey("patch_grass_savanna");
    public static final ResourceKey<PlacedFeature> BROWN_MUSHROOM_NORMAL = registerMCKey("brown_mushroom_normal");
    public static final ResourceKey<PlacedFeature> RED_MUSHROOM_NORMAL = registerMCKey("red_mushroom_normal");
    public static final ResourceKey<PlacedFeature> FLOWER_WARM = registerMCKey("flower_warm");
    public static final ResourceKey<PlacedFeature> SAVANNA_TREES = registerKey("savanna_trees");
    public static final ResourceKey<PlacedFeature> SAVANNA_PLATEAU_TREES = registerKey("savanna_plateau_trees");
    public static final ResourceKey<PlacedFeature> SAVANNA_VEGETATION = registerKey("savanna_vegetation");
    public static final ResourceKey<PlacedFeature> SAVANNA_GRASS_PATCH = registerKey("savanna_grass_patch");
    public static final ResourceKey<PlacedFeature> GRANITE_BOULDERS = registerKey("terrain/granite_boulders");
    public static final ResourceKey<PlacedFeature> GRANITE_SLABS = registerKey("terrain/granite_slabs");
    public static final ResourceKey<PlacedFeature> PACKED_MUD = registerKey("terrain/packed_mud");
    public static final ResourceKey<PlacedFeature> JUNGLE_TREES = registerMCKey("trees_jungle");
    public static final ResourceKey<PlacedFeature> JUNGLE_FLOWERS_MC = registerMCKey("flower_warm");
    public static final ResourceKey<PlacedFeature> JUNGLE_BAMBOO = registerMCKey("bamboo_light");
    public static final ResourceKey<PlacedFeature> JUNGLE_BN_TREES = registerKey("jungle_trees");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_TREES = registerMCKey("trees_sparse_jungle");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_FLOWERS = registerMCKey("flower_warm");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_BN_TREES = registerKey("sparse_jungle_trees");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_BN_PUDDLE = registerKey("terrain/puddle");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_BN_MUD = registerKey("terrain/mud_beach");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_BN_GRASS = registerKey("sparse_jungle_grass_patch");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_LATERIT_BOULDER = registerKey("terrain/laterit_boulder");
    public static final ResourceKey<PlacedFeature> SPARSE_JUNGLE_ORE_LATERIT = registerKey("terrain/ore_laterit");


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new BloomingNatureIdentifier(name));
    }

    public static ResourceKey<PlacedFeature> registerMCKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("minecraft", name));
    }

}
