package com.example.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.common.MenuDB

class MenuItemDetailActivity : AppCompatActivity() {
    private val image: ImageView by lazy { findViewById(R.id.detail_image) }
    private val name: TextView by lazy { findViewById(R.id.detail_name) }
    private val description: TextView by lazy { findViewById(R.id.detail_description) }
    private val price: TextView by lazy { findViewById(R.id.detail_price) }
    private val button: Button by lazy { findViewById(R.id.detail_back) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)
        val mealId = intent.getIntExtra("id", 0)
        val meal = MenuDB.getMealById(mealId + 1)!!

        image.setImageResource(meal.imagem)
        name.text = meal.nome
        description.text = meal.descricao
        price.text = meal.preco

        button.setOnClickListener {
            val it = Intent(this, MainActivity::class.java)
            startActivity(it)
        }
    }
}
