import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editTextUsername: EditText? = null
    private var editTextPassword: EditText? = null
    private var buttonLogin: Button? = null
    private var buttonForgotPassword: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText ve Button bileşenlerini XML dosyasındaki tanımlarla eşleştirme
        editTextUsername = findViewById<EditText>(R.id.editTextText)
        editTextPassword = findViewById<EditText>(R.id.editTextText2)
        buttonLogin = findViewById(R.id.button2)
        buttonForgotPassword = findViewById(R.id.button3)

        // "Giriş Yap" düğmesine tıklama olayı dinleyicisi ekleme
        this.buttonLogin.setOnClickListener(View.OnClickListener {
            val username = editTextUsername.getText().toString().trim { it <= ' ' }
            val password = editTextPassword.getText().toString().trim { it <= ' ' }

            // Kullanıcı adı ve şifrenin doğruluğunu kontrol etme
            if (validateCredentials(username, password)) {
                // Doğru kimlik bilgileri
                Toast.makeText(this@MainActivity, "Giriş Başarılı", Toast.LENGTH_SHORT).show()
                // Giriş işlemini burada işleyebilirsiniz
            } else {
                // Hatalı kimlik bilgileri
                Toast.makeText(
                    this@MainActivity,
                    "Kullanıcı adı veya şifre hatalı",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        // "Şifremi Unuttum" düğmesine tıklama olayı dinleyicisi ekleme
        buttonForgotPassword.setOnClickListener(View.OnClickListener { // Şifre sıfırlama işlemi burada gerçekleştirilebilir
            Toast.makeText(
                this@MainActivity,
                "Şifremi Unuttum düğmesine tıklandı",
                Toast.LENGTH_SHORT
            ).show()
        })
    }

    private fun validateCredentials(username: String, password: String): Boolean {
        // Burada kullanıcı adı ve şifrenin doğruluğunu kontrol etmek için gerekli işlemleri yapabilirsiniz.
        // Örneğin, bir veritabanına veya sunucuya bağlanarak kimlik doğrulama gerçekleştirebilirsiniz.
        // Basit bir örnek için, varsayılan kullanıcı adı "admin" ve şifre "password" olarak kontrol edelim.
        return username == "admin" && password == "password"
    }
}