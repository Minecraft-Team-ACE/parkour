package com.github.mcteamace.parkour;

import com.github.mcteamace.parkour.blocks.ParkourBounceBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class Parkour implements ModInitializer {

	public static final ParkourBounceBlock PARKOUR_BOUNCE_BLOCK = new ParkourBounceBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("parkour", "parkour_bounce_block"), PARKOUR_BOUNCE_BLOCK);
		System.out.println("Parkour: Registered blocks");

		Registry.register(Registry.ITEM, new Identifier("parkour", "parkour_bounce_block"), new BlockItem(PARKOUR_BOUNCE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
		System.out.println("Parkour: Registered items");

		System.out.println("Initialized Parkour Mod.");
	}
}
