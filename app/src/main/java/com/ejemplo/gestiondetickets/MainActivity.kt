package com.ejemplo.gestiondetickets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asigna el layout correspondiente a la actividad principal
        setContentView(R.layout.activity_main)

        // Busca el botón con el ID button_navegar y configura su listener
        val button: Button = findViewById(R.id.button_navegar)
        button.setOnClickListener {
            // Navega a la segunda actividad cuando se presiona el botón
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
