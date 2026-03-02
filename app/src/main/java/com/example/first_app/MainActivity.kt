package com.example.first_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_twitter_searches)

        // 1. Ги наоѓаме елементите од дизајнот
        val rvTags = findViewById<RecyclerView>(R.id.rvTags)

        // 2. Листа со вредностите кои ги видовме на сликата
        val listWithTags = listOf(
            "AndroidFP",
            "Deitel",
            "Google",
            "iPhoneFP",
            "JavaFP",
            "JavaHTP"
        )

        // 3. Му кажуваме на RecyclerView да ги реди елементите еден под друг
        rvTags.layoutManager = LinearLayoutManager(this)

        // 4. Го активираме Adapter-от со нашата листа
        rvTags.adapter = TagAdapter(listWithTags)
    }
}