package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone:Button = findViewById(R.id.btnDone)
        val enterName:TextView = findViewById(R.id.tf_Name)
        val outputName:TextView = findViewById(R.id.tvResult)

        btnDone.setOnClickListener(){
            val inputValue = enterName.text
            outputName.text=inputValue
            outputName.visibility= View.VISIBLE
            enterName.visibility=View.GONE
            btnDone.visibility=View.GONE

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
        }

        outputName.setOnClickListener(){
            outputName.visibility=View.GONE
            enterName.visibility=View.VISIBLE
            btnDone.visibility=View.VISIBLE

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(enterName, 0)
        }
    }
}