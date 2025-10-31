

package com.example.attendance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tlb = findViewById<Button>(R.id.btn_teacher_login)


        tlb.setOnClickListener {

            val intent = Intent(this, TeacherLogin::class.java)


            startActivity(intent)

        }


    }
}