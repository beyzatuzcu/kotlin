package com.example.proje

import AracActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proje.ui.theme.ProjeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

        val buttonClarifai: Button = findViewById(R.id.button_arac)
        val buttonNutritional: Button = findViewById(R.id.button_konut)
        val buttonSangli: Button = findViewById(R.id.button_saglik)
        val buttonHendrikus: Button = findViewById(R.id.button_muhendislik)
        val buttonTumRunlevel: Button = findViewById(R.id.button_tum_urunler)

        buttonClarifai.setOnClickListener {
            val intent = Intent(this@MainActivity, AracActivity::class.java)
            startActivity(intent)
        }

        buttonNutritional.setOnClickListener {
            val intent = Intent(this@MainActivity, KonutActivity::class.java)
            startActivity(intent)
        }

        buttonSangli.setOnClickListener {
            val intent = Intent(this@MainActivity, SaglikActivity::class.java)
            startActivity(intent)
        }

        buttonHendrikus.setOnClickListener {
            val intent = Intent(this@MainActivity, MuhendislikActivity::class.java)
            startActivity(intent)
        }

        buttonTumRunlevel.setOnClickListener {
            val intent = Intent(this@MainActivity, TumUrunlerActivity::class.java)
            startActivity(intent)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjeTheme {
        Greeting("Android")
    }
}
