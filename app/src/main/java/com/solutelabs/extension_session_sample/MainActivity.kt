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

        val isValidNumber = "1234".isDigitOnly // Return true
        val isValid = "1234abc".isDigitOnly // Return false
        val isOnlyAlphabetic = "abcABC".isAlphabeticOnly // Return true
        val isOnlyAlphabetic2 = "abcABC123".isAlphabeticOnly // Return false
        val isOnlyAlphanumeric = "abcABC123".isAlphanumericOnly // Return true
        val isOnlyAlphanumeric2 = "abcABC@123.".isAlphanumericOnly // Return false

    }
}

