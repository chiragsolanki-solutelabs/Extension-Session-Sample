package com.solutelabs.extension_session_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.solutelabs.extension_session_sample.databinding.ActivityMainBinding
import java.util.Date


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val currentDate = Date().toStringFormat()  //2023-05-04 14:02:17
        val currentDate2 = Date().toStringFormat(format = "dd-MM-yyyy") //04-05-2023
        val date = "2023-01-01".toDate(format = "yyyy-MM-dd")


    }
}

