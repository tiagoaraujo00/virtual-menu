package com.example.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.adapters.MenuAdapter
import com.example.trybevirtualmenu.common.MenuDB

class MainActivity : AppCompatActivity() {
    private val mealList: RecyclerView by lazy { findViewById(R.id.main_menu) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val menuListItems = MenuDB.findAll()

        mealList.layoutManager = LinearLayoutManager(baseContext)
        mealList.adapter = MenuAdapter(menuListItems)
    }
}
