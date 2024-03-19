package com.example.internalexam.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.internalexam.ChannelActivity
import com.example.internalexam.R
import com.example.internalexam.model.FindItemModel

class FindAdapter(private val data:List<FindItemModel>): RecyclerView.Adapter<FindAdapter.ViewHolder>() {
    private lateinit var parent: ViewGroup

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var icon: ImageView = itemView.findViewById(R.id.ch_dp)
        var post: ImageView = itemView.findViewById(R.id.ch_dp2)
        var head: TextView = itemView.findViewById(R.id.ch_name)
        var time: TextView = itemView.findViewById(R.id.ch_tim)
        var content: TextView= itemView.findViewById(R.id.ch_cont)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.parent = parent
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.channel_item,parent,false)
        return FindAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.icon.setImageResource(item.icon)
        holder.post.setImageResource(item.post)
        holder.head.text = item.head
        holder.content.text = item.content
        holder.time.text = item.time

        holder.itemView.setOnClickListener {
            val i = Intent(holder.itemView.context, ChannelActivity::class.java)
            i.putExtra("channelPos", position)
            holder.itemView.context.startActivity(i)
        }

    }
}