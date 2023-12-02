package com.example.trybevirtualmenu.interfaces

import com.example.trybevirtualmenu.mealDataClass.menuItem

interface menuItemListener {
    fun onItemMenuClick(menuItem: menuItem)
}