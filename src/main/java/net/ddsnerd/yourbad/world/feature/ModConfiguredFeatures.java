package net.ddsnerd.yourbad.world.feature;
import net.ddsnerd.yourbad.yourbad;
import net.ddsnerd.yourbad.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures{

  public static final List<OreFeatureConfig.Target> END_TITANIUM_ORE = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_TITANIUM_ORE.getDefaultState()));

    public static void registerConfiguredFeatures(){
        yourbad.LOGGER.debug("Registering the ModConfiguredFeatures for" + yourbad.MOD_ID);
    }
}