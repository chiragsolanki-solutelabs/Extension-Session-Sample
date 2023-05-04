package com.solutelabs.extension_session_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.solutelabs.extension_session_sample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        hideKeyboard()

    }
}

