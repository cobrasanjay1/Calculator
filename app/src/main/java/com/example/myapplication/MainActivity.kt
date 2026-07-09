package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView
    private val calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMultiply = findViewById(R.id.btn_mul)
        btnDivision = findViewById(R.id.btn_div)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.tv_result)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val a = etA.text.toString().toDoubleOrNull() ?: 0.0
        val b = etB.text.toString().toDoubleOrNull() ?: 0.0
        var result = 0.0
        when (v?.id) {
            R.id.btn_add -> result = calculator.add(a, b)
            R.id.btn_sub -> result = calculator.subtract(a, b)
            R.id.btn_mul -> result = calculator.multiply(a, b)
            R.id.btn_div -> result = calculator.divide(a, b)
        }
        resultTv.text = "Result: $result"
    }
}

