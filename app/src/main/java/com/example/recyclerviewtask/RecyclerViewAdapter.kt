package com.example.recyclerviewtask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerviewtask.models.User

public class RecyclerViewAdapter(val userList: ArrayList<User>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item_layout,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return userList.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user: User = userList[position]
        holder.name.text = user.name
        holder.address.text = user.address

      //  return holder.itemView;
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById(R.id.text_name) as TextView
        val address = itemView.findViewById(R.id.address) as TextView

    }


}