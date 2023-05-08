package com.example.proje

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MuhendislikActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muhendislik)

        val textViewSorular: TextView = findViewById(R.id.textView_sorular)

        val buttonSoru1: Button = findViewById(R.id.button_soru1)
        val buttonSoru2: Button = findViewById(R.id.button_soru2)

        buttonSoru1.setOnClickListener {
            textViewSorular.text = "İnşaat All Risk Katılım"
        }

        buttonSoru2.setOnClickListener {
            textViewSorular.text = "Leasing All Risk Katılım"
        }
    }

}
