package com.example.projectp0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text

class FavoritesList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites_list)

        val btnAdd : FloatingActionButton = findViewById(R.id.btn_add)
        btnAdd.setOnClickListener(){
            val intent = Intent(this, NewRecipeForm:: class.java)
            startActivity(intent)
        }

        var linkFavList: View = findViewById(R.id.card_view_recipe)
//        var id: TextView = findViewById(R.id.id)
        var title: TextView = findViewById(R.id.title)
//        var rYield: TextView = findViewById(R.id.r_yield)
//        var prepTime: TextView = findViewById(R.id.prep_time)
//        var totalTime: TextView = findViewById(R.id.total_time)

        var titleStr : String = title.text.toString()

        linkFavList.setOnClickListener{
            val intent = Intent(this, RecipePage::class.java)
//            println("titleStr:: ${titleStr}")
            intent.putExtra("title", titleStr)
            startActivity(intent)
        }

    }
}