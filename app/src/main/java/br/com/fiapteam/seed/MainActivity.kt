package br.com.fiapteam.seed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignUp = findViewById<Button>(R.id.MainActivity_btn_login)
        val btnCreate = findViewById<Button>(R.id.MainActivity_btn_create)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        btnCreate.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}