package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun traduzindo(view: View) {
        //Vai executar aqui...
        var caixaDeTexto: TextView = findViewById(R.id.textView2)
        caixaDeTexto.text = "Olá Mundo!"
    }
}