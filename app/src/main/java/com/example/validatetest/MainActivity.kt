package com.example.validatetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edText = findViewById<EditText>(R.id.edText)
        val tvText = findViewById<TextView>(R.id.tvText)
        val enter = findViewById<Button>(R.id.enter)

        enter.setOnClickListener {
            val text = edText.text.toString()
            if (text == "") {
                edText.error = "名前を入力してください"
            } else {
                tvText.text = text
            }
        }
    }
}