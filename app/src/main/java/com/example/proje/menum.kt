import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var saglikButton: Button? = null
    private var muhendislikButton: Button? = null
    private var tumUrunlerButton: Button? = null
    private var araclarButton: Button? = null
    private var konutButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saglikButton = findViewById<Button>(R.id.saglikButton)
        muhendislikButton = findViewById<Button>(R.id.muhendislikButton)
        tumUrunlerButton = findViewById<Button>(R.id.tumUrunlerButton)
        araclarButton = findViewById<Button>(R.id.araclarButton)
        konutButton = findViewById<Button>(R.id.konutButton)
        saglikButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Sağlık seçildi", Toast.LENGTH_SHORT).show()
            // İlgili işlemler burada yapılabilir
        })
        muhendislikButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Mühendislik seçildi", Toast.LENGTH_SHORT).show()
            // İlgili işlemler burada yapılabilir
        })
        tumUrunlerButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Tüm Ürünler seçildi", Toast.LENGTH_SHORT).show()
            // İlgili işlemler burada yapılabilir
        })
        araclarButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Araçlar seçildi", Toast.LENGTH_SHORT).show()
            // İlgili işlemler burada yapılabilir
        })
        konutButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Konut seçildi", Toast.LENGTH_SHORT).show()
            // İlgili işlemler burada yapılabilir
        })
    }
}