package com.example.roomdb

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdb.Fragments.update
import com.example.roomdb.databinding.ItemViewBinding

class RvAdaptar(var context: Context,var dataList:ArrayList<dataModel>):RecyclerView.Adapter<RvAdaptar.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding= ItemViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    holder.binding.name.text="Full Name:- "+dataList.get(position).firstName+" " + dataList.get(position).lastName
        holder.binding.tvAge.text=dataList.get(position).age

    }
    inner class MyViewHolder(var binding: ItemViewBinding):RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                val updateFragment = update()
                val fragmentManager = (context as AppCompatActivity).supportFragmentManager
                fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, updateFragment)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }
}