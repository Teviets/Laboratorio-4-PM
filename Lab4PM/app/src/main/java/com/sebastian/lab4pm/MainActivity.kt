package com.Sebastian.lab4plataformasmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import android.widget.Button
import android.content.Intent
import com.sebastian.lab4pm.R


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button4);

        initListener();
    }
    fun initListener(){
        button.setOnClickListener{
            Toast.makeText(this, "Sebastian Estrada Tuch", Toast.LENGTH_LONG).show()
        }
    }
}