import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.proje.R

class AracActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arac)

        val textViewSorular: TextView = findViewById(R.id.textView_sorular)

        val buttonSor1: Button = findViewById(R.id.button_soru1)
        val buttonSou2: Button = findViewById(R.id.button_soru2)
        val buttonSou3: Button = findViewById(R.id.button_soru3)
        val buttonSou4: Button = findViewById(R.id.button_soru4)

        buttonSor1.setOnClickListener {
            textViewSorular.text = "Güvence Kapsamı Nedir?"
        }

        buttonSou2.setOnClickListener {
            textViewSorular.text = "Genel Şartlar Nelerdir?"
        }

        buttonSou3.setOnClickListener {
            textViewSorular.text = "Poliçemin süresi ne kadar?"
        }

        buttonSou4.setOnClickListener {
            textViewSorular.text = "Poliçemle İlgili Detaylı Bilgiyi Nereden Alabilirim?"
        }
    }
}
