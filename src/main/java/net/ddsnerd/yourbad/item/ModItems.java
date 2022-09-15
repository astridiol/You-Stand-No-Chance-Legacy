//Adds All The Items Into The Game
package net.ddsnerd.yourbad.item;

import net.ddsnerd.yourbad.item.custom.ModAxeItem;
import net.ddsnerd.yourbad.yourbad;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item WOODSCYTHE = registerItem("woodscythe", new ModAxeItem(ModToolMaterials.WOOD, 3, 0.005f,  new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item STONESCYTHE = registerItem("stonescythe", new ModAxeItem(ModToolMaterials.STONE, 4, 0f,  new FabricItemSettings().group(ModItemGroup.SCYTHES)));

    public static final Item IRONSCYTHE = registerItem("ironscythe", new ModAxeItem(ModToolMaterials.IRON, 10, 0f,  new FabricItemSettings().group(ModItemGroup.SCYTHES)));

    public static final Item GOLDSCYTHE = registerItem("goldscythe", new ModAxeItem(ModToolMaterials.GOLD, 8, 0f,  new FabricItemSettings().group(ModItemGroup.SCYTHES)));

    public static final Item DIAMONDSCYTHE = registerItem("diamondscythe", new ModAxeItem(ModToolMaterials.DIAMOND, 12, 0f,  new FabricItemSettings().group(ModItemGroup.SCYTHES)));

    public static final Item NETHERITESCYTHE = registerItem("netheritescythe", new ModAxeItem(ModToolMaterials.NETHERITE, 13, 0f,  new FabricItemSettings().group(ModItemGroup.SCYTHES)));

   // public static final Item TITAINIUMHELMET = registerItem("titaniumhelmet", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.SCYTHESORE)));

   // public static final Item TITAINIUMCHESTPLATE = registerItem("titaniumchestplate", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.SCYTHESORE)));

  //  public static final Item TITAINIUMLEGGINGS = registerItem("titaniumleggings", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.SCYTHESORE)));

  //  public static final Item TITAINIUMBOOTS = registerItem("titaniumboots", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.SCYTHESORE)));
  //  public static final Item TITANIUM = registerItem("titanium", new Item(new FabricItemSettings().group(ModItemGroup.SCYTHESORE)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(yourbad.MOD_ID, name), item);
    }

    public static void registerModItems(){
        yourbad.LOGGER.info("Registering Mod Items For " + yourbad.MOD_ID);
    }

}
