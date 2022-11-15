//What Material And What Damage And What Level Of Duribility And Attack Speed
package net.ddsnerd.yourbad.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import net.minecraft.tag.ItemTags;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    WOOD(MiningLevels.WOOD, 59, 0.0f, 0.0f, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE(MiningLevels.STONE, 131, 0.0f, 0.0f, 5, () -> Ingredient.fromTag(ItemTags.STONE_CRAFTING_MATERIALS)),
    IRON(MiningLevels.IRON, 250, 0.0f, 0.0f, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD(MiningLevels.WOOD, 32, 0.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    DIAMOND(MiningLevels.DIAMOND, 1561, 0.0f, 0.0f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE(MiningLevels.NETHERITE, 2031, 0.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    TITANIUMAXE(MiningLevels.NETHERITE, 2033, 0.0f, 1.0f, 15, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    TITANIUMSCYTHE(MiningLevels.NETHERITE, 2033, 0.0f, 2.0f, 15, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
