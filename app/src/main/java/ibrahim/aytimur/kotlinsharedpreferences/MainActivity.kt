package ibrahim.aytimur.kotlinsharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Kotlin de veri saklama - SharedPreferences
        var SharedPreferences = this.getSharedPreferences("KullaniciBilgileri", Context.MODE_PRIVATE)
        var editor = SharedPreferences.edit()
        // Veri ekleme - kaydetme
        editor.putString("kullanici","kotlin").apply()
        editor.putInt("sifre",2011).apply()

        // Veri okuma
        var kayitliKullanici = SharedPreferences.getString("kullanici","")
        var kayitliSifre = SharedPreferences.getInt("sifre",0)
        textView.text = "Kullanıcı: "+kayitliKullanici + "\n" + "Şifre: "+ kayitliSifre

        // editor nesnesinin temel metotları
        /*
        apply() :Verileri eşzamanlı olmadan(yani asenkron) kaydeder. Kaydetme işlemi hakkında bilgi vermez
        commit():Verileri eşzamanlı(yani senkron) kaydeder. Kaydetme işlemi hakkında da  bilgi verir.
        clear() :tüm verileri siler.
        remove(key:String) : Anahtar değerini girerek dosyadan veriyi siler.
         */
    }
}