package com.ejemplo.gestiondetickets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asigna el layout correspondiente a la segunda actividad
        setContentView(R.layout.activity_second)
    }
}
