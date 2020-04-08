package com.example.recyclerviewtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtask.models.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recycler_view) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val user = ArrayList<User>()
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        user.add(User("Ernest Efertin", "Port Harcourt"))
        val adapter = RecyclerViewAdapter(user)
        recyclerView.adapter = adapter

    }
}
