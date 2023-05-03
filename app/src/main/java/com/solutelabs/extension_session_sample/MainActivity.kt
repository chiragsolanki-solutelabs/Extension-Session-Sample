package com.solutelabs.extension_session_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.doneButton

class MainActivity : AppCompatActivity() {

    val datafound: Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doneButton.gone()
        doneButton.visible()

        doneButton goneIf datafound
        doneButton visibleIf datafound

    }
}

