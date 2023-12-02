package com.example.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.adapters.MenuAdapter
import com.example.trybevirtualmenu.common.MenuDB
import com.example.trybevirtualmenu.interfaces.MenuItemListener

class MainActivity : AppCompatActivity(), MenuItemListener {
    private val mealList: RecyclerView by lazy { findViewById(R.id.main_menu) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val menuListItems = MenuDB.findAll()

        val adapter = MenuAdapter(menuListItems)
        adapter.setMenuListener(this)

        mealList.layoutManager = LinearLayoutManager(baseContext)
        mealList.adapter = adapter
    }

    override fun onMenuItemClick(view: View, position: Int) {
        val it = Intent(baseContext, MenuItemDetailActivity::class.java)
        it.putExtra("nome", position)
        startActivity(it)
    }
}
