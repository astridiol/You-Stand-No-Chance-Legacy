package net.ddsnerd.yourbad.world.feature;

import net.ddsnerd.yourbad.yourbad;
import net.ddsnerd.yourbad.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> ENDSTONE_TITANIUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_TITANIUM_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_TITANIUM_ORE =
            ConfiguredFeatures.register("titanium_ore",Feature.ORE, new OreFeatureConfig(ENDSTONE_TITANIUM_ORES, 12));


    public static void registerConfiguredFeatures() {
        yourbad.LOGGER.debug("Registering the ModConfiguredFeatures for " + yourbad.MOD_ID);
    }
}