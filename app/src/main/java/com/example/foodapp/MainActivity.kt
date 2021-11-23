package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var button: Button
    lateinit var nameF: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listF = mutableListOf<Food>()
        listF.add(Food("Foo1",R.drawable.food1))
        listF.add(Food("Foo2",R.drawable.food2))
        listF.add(Food("Foo3",R.drawable.food3))
        listF.add(Food("Foo4",R.drawable.food4))
        listF.add(Food("Foo5",R.drawable.food5))
        listF.add(Food("Foo6",R.drawable.food6))


        imageView = findViewById(R.id.imageView);
        nameF = findViewById(R.id.name)
        button = findViewById(R.id.button);

        button.setOnClickListener {
            var randomInt:Int = Random.nextInt( listF.size)

            nameF.text = listF[randomInt].name
            imageView.setImageResource(listF[randomInt].img)
        }

    }
}