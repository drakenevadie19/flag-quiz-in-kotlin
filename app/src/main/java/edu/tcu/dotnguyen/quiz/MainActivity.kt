package edu.tcu.dotnguyen.quiz

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nameEt = findViewById<TextInputEditText>(R.id.name_et)
        nameEt.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_GO) { // When user click actionGO (arrow forward) button
//                if (nameEt.text.toString() != "") {
//                    Toast.makeText(this, nameEt.text.toString(), Toast.LENGTH_SHORT).show()
//                } else {
//                    Toast.makeText(this, "Please input name", Toast.LENGTH_SHORT).show()
//                }
                goToQuestion(nameEt)
                true // Since lambda expression return a boolean
            } else false
        }
    }

    // goToQuestion method will deal with intent and forward
    private fun goToQuestion(nameEt: TextInputEditText) {
        // Deal with an empty name
        if (nameEt.text.toString() == "") {
            Toast.makeText(this, "Please input name", Toast.LENGTH_SHORT).show()
        } else {
            // Move to next page
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("fvgbhnj", nameEt.text.toString())
            startActivity(intent)
            finish() // Destroy previous page, since it unnecessary
        }
    }

}