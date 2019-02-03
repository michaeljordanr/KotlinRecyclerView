package com.example.kotlinrecyclerview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinrecyclerview.R
import com.example.kotlinrecyclerview.adapter.ProgrammingLanguageAdapter
import com.example.kotlinrecyclerview.model.ProgrammingLanguage
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.adapter = ProgrammingLanguageAdapter(
            recyclerViewItems(),
            this
        ) {
            longToast("Clicked item: ${it.title}")
        }

        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager
    }

    private fun recyclerViewItems(): List<ProgrammingLanguage> {
        val kotlin = ProgrammingLanguage(
            R.drawable.kotlin,
            "Kotlin",
            2010,
            "Kotlin description"
        )

        return listOf(kotlin, kotlin)
    }
}
