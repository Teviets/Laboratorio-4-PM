package com.Sebastian.lab4plataformasmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import com.sebastian.lab4pm.R


class MainActivity : AppCompatActivity() {
    lateinit var ToastMessageName: Button
    lateinit var descarga: Button
    lateinit var detalles: Button
    lateinit var locacion: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessageName = findViewById(R.id.ToastMessage);
        descarga = findViewById(R.id.boton_Descarga);
        detalles = findViewById(R.id.Details);
        locacion = findViewById(R.id.LocationRes);

        initListener();
    }
    fun initListener(){
        ToastMessageName.setOnClickListener{
            Toast.makeText(this, "Sebastian Estrada Tuch", Toast.LENGTH_LONG).show()
        }
        descarga.setOnClickListener{
           /* val webIntent: Intent = Uri.parse("https://www.android.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }*/
        }
        detalles.setOnClickListener{

        }
        locacion.setOnClickListener {

        }

    }
}