package com.example.telegram_1_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

    lateinit var recyclerView: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this,1))
        refreshAdapter(getAllChats())
    }
    fun refreshAdapter(chats:ArrayList<Chat>){
        val adapter = ChatAdapter(this,chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{

        val chats:ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"))
        chats.add(Chat(R.drawable.foto2,"Abdulhakim Omonboyev","last seen recently"))
        chats.add(Chat(R.drawable.foto3,"Muslim Abdurashidov","last seen recently"))
        chats.add(Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"))
        chats.add(Chat(R.drawable.foto2,"Abdulhakim Omonboyev","last seen recently"))
        chats.add(Chat(R.drawable.foto3,"Muslim Abdurashidov","last seen recently"))
        chats.add(Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"))
        chats.add(Chat(R.drawable.foto2,"Abdulhakim Omonboyev","last seen recently"))
        chats.add(Chat(R.drawable.foto3,"Muslim Abdurashidov","last seen recently"))
        chats.add(Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"))
        chats.add(Chat(R.drawable.foto2,"Abdulhakim Omonboyev","last seen recently"))
        chats.add(Chat(R.drawable.foto3,"Muslim Abdurashidov","last seen recently"))
        chats.add(Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"))
        chats.add(Chat(R.drawable.foto2,"Abdulhakim Omonboyev","last seen recently"))
        chats.add(Chat(R.drawable.foto3,"Muslim Abdurashidov","last seen recently"))
        chats.add(Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"))
        chats.add(Chat(R.drawable.foto2,"Abdulhakim Omonboyev","last seen recently"))
        chats.add(Chat(R.drawable.foto3,"Muslim Abdurashidov","last seen recently"))


        return chats
    }
}