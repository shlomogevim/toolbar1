package com.sg.toolbar1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // setSupportActionBar(my_toolbar)   // the activity name
        number_text.text="17"
        my_toolbar.title="מה קורה מלך"
       //my_toolbar.setBackgroundColor(Color.DKGRAY)
    }
}