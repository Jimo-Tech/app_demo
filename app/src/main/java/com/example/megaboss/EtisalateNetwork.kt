package com.example.megaboss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class EtisalateNetwork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_etisalate_network)

        supportActionBar?.hide()

        val languages = resources.getStringArray(R.array.etisalat_data_plans)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_menu, languages)
        val autoCompleteTv = findViewById<AutoCompleteTextView>(R.id.autoetisalat)
        autoCompleteTv.setAdapter(arrayAdapter)
    }
}