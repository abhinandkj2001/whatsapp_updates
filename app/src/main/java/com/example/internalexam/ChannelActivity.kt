package com.example.internalexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.internalexam.model.SampleData

class ChannelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_channel)

        val data = intent
        val  pos = data.getIntExtra("channelPos",0)
        val chname = findViewById<TextView>(R.id.channel_name)
        val chcontent = findViewById<TextView>(R.id.channel_content)
        val chtime = findViewById<TextView>(R.id.channel_time)
        val chimage = findViewById<ImageView>(R.id.channel_image)
        val chbody = findViewById<ImageView>(R.id.channel_body)

        chname.text=SampleData.findDemo[pos].head
        chcontent.text=SampleData.findDemo[pos].content
        chtime.text=SampleData.findDemo[pos].time
        chimage.setImageResource(SampleData.findDemo[pos].icon)
        chbody.setImageResource(SampleData.findDemo[pos].post)





    }
}