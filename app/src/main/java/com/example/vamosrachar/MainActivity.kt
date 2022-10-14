package com.example.vamosrachar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input1 = findViewById<EditText>(R.id.editTextValue)
        val input2 = findViewById<EditText>(R.id.editTextNumPessoas)
        val result = findViewById<TextView>(R.id.textResult)
    }

    private val textWatcher = object : editTextValue {
        fun afterTextChanged(s: Editable?) {
        }
        fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }
        fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            calcula(input1,input2)
        }
    }
    fun print (){
        val input1 = null
       println(input1)
    }

}