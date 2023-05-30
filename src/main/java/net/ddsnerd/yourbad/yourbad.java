package net.ddsnerd.yourbad;

import net.ddsnerd.yourbad.block.ModBlocks;
import net.ddsnerd.yourbad.item.ModItemGroup;
import net.ddsnerd.yourbad.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class yourbad implements ModInitializer {
	public static final String MOD_ID = "yourbad";
	public static final Logger LOGGER = LoggerFactory.getLogger("yourbad");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
