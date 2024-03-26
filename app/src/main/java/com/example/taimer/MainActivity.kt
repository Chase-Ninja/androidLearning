package com.example.taimer
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val name = "Hi Aarav, how are you?"
    val KEY = "key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val editText = findViewById<EditText>(R.id.EditingId)
         if (savedInstanceState != null){
            editText.setText(savedInstanceState.getString(KEY))

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY,name)
    }
}