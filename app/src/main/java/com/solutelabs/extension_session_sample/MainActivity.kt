package com.solutelabs.extension_session_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myString = "Hello This is Chirag Here"
        myString.printLog()

        val student = Student("Chirag Solanki", "Solutelabs")
        student.printLog()
    }
}

data class Student(val name: String, val schoolName: String)