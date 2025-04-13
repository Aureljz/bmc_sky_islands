package net.aurelj.bmc_sky_islands.fabric;

import net.fabricmc.api.ModInitializer;

import net.aurelj.bmc_sky_islands.BMCSkyIslandsMain;

public final class BMCSkyIslandsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        BMCSkyIslandsMain.init();
    }
}
