package com.example.megaboss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class AirtelNetwork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airtel_network)

        supportActionBar?.hide()

        val languages = resources.getStringArray(R.array.airtel_data_plan)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_menu, languages)
        val autoCompleteTv = findViewById<AutoCompleteTextView>(R.id.autoairtel)
        autoCompleteTv.setAdapter(arrayAdapter)
    }
}