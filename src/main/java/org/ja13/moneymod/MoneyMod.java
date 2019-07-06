package org.ja13.moneymod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * MoneyMod - Main FML Interface class for the MOTD Mod.
 */
@Mod(modid = MoneyMod.MODID, version = MoneyMod.VERSION, acceptableRemoteVersions = "*")
public class MoneyMod {

    // Mod information
    static final String MODID = "moneymod";
    static final String VERSION = "1.0";

    @EventHandler
    public void load(FMLInitializationEvent event) {
        System.out.println("Hello, World!");
    }
}
