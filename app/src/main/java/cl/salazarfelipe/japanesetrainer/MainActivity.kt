package cl.salazarfelipe.japanesetrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, Menu.newInstance("", ""), "Menu")
                .commit()
        } else {
            supportFragmentManager.findFragmentByTag("Menu")
        }
    }
}