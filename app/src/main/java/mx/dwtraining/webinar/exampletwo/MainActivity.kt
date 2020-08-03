package mx.dwtraining.webinar.exampletwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindListeners()
    }

    fun bindListeners() {

    }

    fun sendText(text: String) {

    }

    fun sendEmail(addresses: Array<String>, subject: String) {

    }

    fun sendWhatsApp(message: String) {

    }

    fun openMaps(uri: String) {

    }

    fun openWebPage(url: String) {

    }

}
