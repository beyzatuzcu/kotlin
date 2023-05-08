import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.proje.R

class DonutActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konut)

        val buttonDask: Button = findViewById(R.id.button_dask)
        val buttonKonutKatilim: Button = findViewById(R.id.button_konut_katilim)
        val buttonEsyaGuvende: Button = findViewById(R.id.button_esya_guvende)

        buttonDask.setOnClickListener {
            val intent = Intent(this@DonutActivity, DaskActivity::class.java)
            startActivity(intent)
        }

        buttonKonutKatilim.setOnClickListener {
            val intent = Intent(this@DonutActivity, KonutKatilimActivity::class.java)
            startActivity(intent)
        }

        buttonEsyaGuvende.setOnClickListener {
            val intent = Intent(this@DonutActivity, EsyaGuvendeActivity::class.java)
            startActivity(intent)
        }
    }
}

