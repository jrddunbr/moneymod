package org.ja13.moneymod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

/**
 * MoneyMod - Main FML Interface class for the MOTD Mod.
 */
@Mod(modid = MoneyMod.MODID, version = MoneyMod.VERSION, acceptableRemoteVersions = "*")
public class MoneyMod {

    // Mod information
    static final String MODID = "moneymod";
    static final String VERSION = "1.1";

    protected static Coin dollar;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MoneyTab tab = new MoneyTab();

        ArrayList<MoneyModItems> items = new ArrayList<MoneyModItems>();

        items.add(new Dollar("One", "dollarOne", tab));
        items.add(new Dollar("Five", "dollarFive", tab));
        items.add(new Dollar("Ten", "dollarTen", tab));
        items.add(new Dollar("Twenty", "dollarTwenty", tab));
        items.add(new Dollar("Fifty", "dollarFifty", tab));
        items.add(new Dollar("Hundred", "dollarHundred", tab));

        items.add(new Coin("Penny", "centOne", tab));
        items.add(new Coin("Nickel", "centFive", tab));
        items.add(new Coin("Dime", "centTen", tab));
        items.add(new Coin("Quarter", "centTwentyFive", tab));
        items.add(new Coin("Half Dollar Coin", "centFifty", tab));
        dollar = new Coin("Dollar Coin", "centHundred", tab);
        items.add(dollar);

        for (MoneyModItems item : items) {
            GameRegistry.registerItem(item, item.getOredict());
            OreDictionary.registerOre(item.getOredict(), item);
        }
    }
}