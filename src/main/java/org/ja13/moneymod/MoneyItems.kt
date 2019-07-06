package org.ja13.moneymod

import net.minecraft.item.Item

class Dollar: Item {
    constructor(size: String, tab: MoneyTab) {
        setUnlocalizedName(size + " Dollar Bill".replace(" ", "_"))
        setTextureName("moneymod:" + size.toLowerCase() + "dollars")
        setMaxStackSize(64)
        setCreativeTab(tab)
    }
}

class Coin: Item {
    constructor(size: String, tab: MoneyTab) {
        setUnlocalizedName(size.replace(" ", "_"))
        setTextureName("moneymod:" + size.toLowerCase().replace(" ", ""))
        setMaxStackSize(64)
        setCreativeTab(tab)
    }
}