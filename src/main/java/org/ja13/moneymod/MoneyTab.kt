package org.ja13.moneymod

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class MoneyTab: CreativeTabs {
    constructor() : super("MoneyMod_Items")

    override fun getTabIconItem(): Item {
        return MoneyMod.dollar;
    }
}