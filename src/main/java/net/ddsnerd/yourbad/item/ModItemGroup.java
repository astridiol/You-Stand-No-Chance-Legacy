//Makes A Custom Item Group
package net.ddsnerd.yourbad.item;

import net.ddsnerd.yourbad.yourbad;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SCYTHES = FabricItemGroupBuilder.build(new Identifier(yourbad.MOD_ID, "scythes"), () -> new ItemStack(ModItems.NETHERITESCYTHE));
   public static final ItemGroup SCYTHESORE = FabricItemGroupBuilder.build(new Identifier(yourbad.MOD_ID, "scytheore"),  () -> new ItemStack(ModItems.TITANIUM_INGOT));
}
