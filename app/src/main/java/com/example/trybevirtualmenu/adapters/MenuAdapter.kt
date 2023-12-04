//package com.example.trybevirtualmenu.adapters
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.Adapter
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//import com.example.trybevirtualmenu.R
//import com.example.trybevirtualmenu.interfaces.MenuItemListener
//import com.example.trybevirtualmenu.mealDataClass.MenuItem
//
//
//class MenuAdapter(private val meal: List<MenuItem>) : Adapter<MenuAdapter.MenuViewHolder>() {
//
//    private var menuListener: MenuItemListener? = null
//
//    fun setMenuListener(listener: MenuItemListener) {
//        this.menuListener = listener
//    }
//
//    class MenuViewHolder(view: View, menuListener: MenuItemListener?) : ViewHolder(view) {
//        val name: TextView = view.findViewById(R.id.item_menu_name)
//        val image: ImageView = view.findViewById(R.id.item_menu_image)
//
////        init {
////            view.setOnClickListener {
////                val position = adapterPosition
////                if (position != RecyclerView.NO_POSITION) {
////                    menuListener?.onMenuItemClick(view, meal[position])
////                }
////            }
////        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
//        val view =
//            LayoutInflater.from(parent.context).inflate(R.layout.item_menu_layout, parent, false)
//        return MenuViewHolder(view, menuListener)
//    }
//
//    override fun getItemCount(): Int = meal.size
//
////    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
////        holder.name.text = meal[position].nome
////        holder.image.setImageResource(meal[position].imagem)
////        holder.itemView.setOnClickListener {  MenuItemListener?.onMenuItemClick(meal[position]) }
////    }
//}
