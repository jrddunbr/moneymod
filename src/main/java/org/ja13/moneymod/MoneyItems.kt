package org.ja13.moneymod

import net.minecraft.item.Item

open class MoneyModItems(oredict: String): Item() {
    protected val oredict: String
    init {
        this.oredict = oredict
    }
}

class Dollar(size: String, oredict: String, tab: MoneyTab) : MoneyModItems(oredict) {
    init {
        setUnlocalizedName(size + " Dollar Bill".replace(" ", "_"))
        setTextureName("moneymod:" + size.toLowerCase() + "dollars")
        setMaxStackSize(64)
        setCreativeTab(tab)
    }
}

class Coin(size: String, oredict: String, tab: MoneyTab) : MoneyModItems(oredict) {
    init {
        setUnlocalizedName(size.replace(" ", "_"))
        setTextureName("moneymod:" + size.toLowerCase().replace(" ", ""))
        setMaxStackSize(64)
        setCreativeTab(tab)
    }
}