package com.example.proje

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SaglikActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saglik)
        val buttonHayatSigortasi: Button = findViewById(R.id.button_hayat_sigortasi)
        val buttonFerdiKazaSigortasi: Button = findViewById(R.id.button_ferdi_kaza_sigortasi)
        val buttonTehlikeliHastaliklar: Button = findViewById(R.id.button_tehlikeli_hastaliklar)
        val buttonAilemGuvende: Button = findViewById(R.id.button_ailem_guvende)

        buttonHayatSigortasi.setOnClickListener {
            val intent = Intent(this@SaglikActivity, HayatSigortasiActivity::class.java)
            startActivity(intent)
        }

        buttonFerdiKazaSigortasi.setOnClickListener {
            val intent = Intent(this@SaglikActivity, FerdiKazaSigortasiActivity::class.java)
            startActivity(intent)
        }

        buttonTehlikeliHastaliklar.setOnClickListener {
            val intent = Intent(this@SaglikActivity, TehlikeliHastaliklarActivity::class.java)
            startActivity(intent)
        }

        buttonAilemGuvende.setOnClickListener {
            val intent = Intent(this@SaglikActivity, AilemGuvendeActivity::class.java)
            startActivity(intent)
        }
    }
}