

package com.example.attendance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val studentLoginButton = findViewById<Button>(R.id.btn_student_login)


        studentLoginButton.setOnClickListener {

            val intent = Intent(this, StudentLogin::class.java)


            startActivity(intent)

        }


    }
}