package com.example.megaboss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MtnNetwork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mtn_network)
        supportActionBar?.hide()

        val languages = resources.getStringArray(R.array.mtn_data_plan)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_menu, languages)
        val autoCompleteTv = findViewById<AutoCompleteTextView>(R.id.autoMtn)
        autoCompleteTv.setAdapter(arrayAdapter)
    }
}