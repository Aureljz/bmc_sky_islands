package net.aurelj.bmc_sky_islands.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.aurelj.bmc_sky_islands.BMCSkyIslandsMain;

@Mod(BMCSkyIslandsMain.MOD_ID)
public final class BMCSkyIslandsForge {
    public BMCSkyIslandsForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(BMCSkyIslandsMain.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        BMCSkyIslandsMain.init();
    }
}
