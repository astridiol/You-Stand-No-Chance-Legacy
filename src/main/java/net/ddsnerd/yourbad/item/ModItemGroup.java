package net.ddsnerd.yourbad.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ddsnerd.yourbad.yourbad;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup SCYTHES;
    public static ItemGroup SCYTHESORE;

    public static void registerItemGroups() {



        SCYTHES = FabricItemGroup.builder(new Identifier(yourbad.MOD_ID, "scythes"))
                .displayName(Text.literal("You Stand No Chance Pt. 1"))
                .icon(() -> new ItemStack(ModItems.NETHERITESCYTHE)).build();
        SCYTHESORE = FabricItemGroup.builder(new Identifier(yourbad.MOD_ID, "scytheore"))
                .displayName(Text.literal("You Stand No Chance Pt. 2 (Don't Use)"))
                .icon(() -> new ItemStack(ModItems.TITANIUM_INGOT)).build();
    }
}
