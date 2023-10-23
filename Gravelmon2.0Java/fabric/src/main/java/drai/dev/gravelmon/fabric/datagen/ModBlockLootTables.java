package drai.dev.gravelmon.fabric.datagen;

import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.data.*;
import net.minecraft.data.loot.*;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.storage.loot.entries.*;

import java.util.concurrent.*;

public class ModBlockLootTables extends FabricBlockLootTableProvider {
    protected ModBlockLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        add(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.ASTRAL_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.ASTRAL_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.MYSTIC_STONE.get()))));
        add(GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.MYSTIC_STONE.get()))));
        add(GravelmonBlocks.AIR_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.AIR_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.AIR_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.AIR_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.AIR_STONE.get()))));
        add(GravelmonBlocks.SOLID_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.SOLID_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.SOLID_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.SOLID_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(),
                BlockLootSubProvider.createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.SOLID_STONE.get()))));
        }
}
