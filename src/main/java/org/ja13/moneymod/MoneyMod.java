package org.ja13.moneymod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;

/**
 * MoneyMod - Main FML Interface class for the MOTD Mod.
 */
@Mod(modid = MoneyMod.MODID, version = MoneyMod.VERSION, acceptableRemoteVersions = "*")
public class MoneyMod {

    // Mod information
    static final String MODID = "moneymod";
    static final String VERSION = "1.0";

    protected static Coin dollar;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MoneyTab tab = new MoneyTab();

        Dollar oneDollar, fiveDollar, tenDollar, twentyDollar, fiftyDollar, hundredDollar;
        Coin penny, nickel, dime, quarter, halfdollar;

        oneDollar = new Dollar("One", tab);
        fiveDollar = new Dollar("Five", tab);
        tenDollar = new Dollar("Ten", tab);
        twentyDollar = new Dollar("Twenty", tab);
        fiftyDollar = new Dollar("Fifty", tab);
        hundredDollar = new Dollar("Hundred", tab);

        penny = new Coin("Penny", tab);
        nickel = new Coin("Nickel", tab);
        dime = new Coin("Dime", tab);
        quarter = new Coin("Quarter", tab);
        halfdollar = new Coin("Half Dollar Coin", tab);
        dollar = new Coin("Dollar Coin", tab);

        GameRegistry.registerItem(oneDollar, "dollarOne");
        GameRegistry.registerItem(fiveDollar, "dollarFive");
        GameRegistry.registerItem(tenDollar, "dollarTen");
        GameRegistry.registerItem(twentyDollar, "dollarTwenty");
        GameRegistry.registerItem(fiftyDollar, "dollarFifty");
        GameRegistry.registerItem(hundredDollar, "dollarHundred");

        GameRegistry.registerItem(penny, "centOne");
        GameRegistry.registerItem(nickel, "centFive");
        GameRegistry.registerItem(dime, "centTen");
        GameRegistry.registerItem(quarter, "centTwentyFive");
        GameRegistry.registerItem(halfdollar, "centFifty");
        GameRegistry.registerItem(dollar, "centHundred");
    }
}