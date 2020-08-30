package com.geek.changeproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.zel_btn)
        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(baseContext,"куку",Toast.LENGTH_SHORT).show()
        })
    }
}