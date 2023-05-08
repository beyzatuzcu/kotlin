package com.example.proje

import AracActivity
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TumUrunlerActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tum_urunler)

        val buttonArac: Button = findViewById(R.id.button_arac)
        val buttonKonut: Button = findViewById(R.id.button_konut)
        val buttonHayatKaza: Button = findViewById(R.id.button_hayat_kaza)
        val buttonIsyeri: Button = findViewById(R.id.button_isyeri)
        val buttonMuhendislik: Button = findViewById(R.id.button_muhendislik)

        buttonArac.setOnClickListener {
            val intent = Intent(this@TumUrunlerActivity, AracActivity::class.java)
            startActivity(intent)
        }

        buttonKonut.setOnClickListener {
            val intent = Intent(this@TumUrunlerActivity, KonutActivity::class.java)
            startActivity(intent)
        }

        buttonHayatKaza.setOnClickListener {
            val intent = Intent(this@TumUrunlerActivity, HayatKazaActivity::class.java)
            startActivity(intent)
        }

        buttonIsyeri.setOnClickListener {
            val intent = Intent(this@TumUrunlerActivity, IsyeriActivity::class.java)
            startActivity(intent)
        }

        buttonMuhendislik.setOnClickListener {
            val intent = Intent(this@TumUrunlerActivity, MuhendislikActivity::class.java)
            startActivity(intent)
        }
    }
}
