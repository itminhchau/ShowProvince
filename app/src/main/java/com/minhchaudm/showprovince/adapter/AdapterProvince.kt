package com.minhchaudm.showprovince.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.minhchaudm.showprovince.R
import com.minhchaudm.showprovince.model.Province
import io.realm.RealmResults

class AdapterProvince(var context: Context, var dataProvince: ArrayList<Province>): RecyclerView.Adapter<AdapterProvince.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imageProvince: ImageView
        var nameProvince: TextView
        init {
            imageProvince = itemView.findViewById(R.id.image_item) as ImageView
            nameProvince = itemView.findViewById(R.id.text_item) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater: LayoutInflater = LayoutInflater.from(context)
        var itemView: View = layoutInflater.inflate(R.layout.item_row,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataProvince.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.imageProvince.setBackgroundResource(dataProvince[position].getImage())
        holder.nameProvince.text = dataProvince[position].getName()
    }

}