package com.example.megaboss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MGloNetwork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mglo_network)

        supportActionBar?.hide()

        val languages = resources.getStringArray(R.array.glo_data_pLan)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_menu, languages)
        val autoCompleteTv = findViewById<AutoCompleteTextView>(R.id.autoGlo)
        autoCompleteTv.setAdapter(arrayAdapter)


    }
}