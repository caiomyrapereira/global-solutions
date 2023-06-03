package br.com.fiapteam.seed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnSignUp = findViewById<Button>(R.id.Login_btn_signup)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}