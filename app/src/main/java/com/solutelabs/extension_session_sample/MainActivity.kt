package com.solutelabs.extension_session_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.solutelabs.extension_session_sample.databinding.ActivityMainBinding
import java.util.Date


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)


        viewBinding.recycleList.bindData(
            data = listOf(Student("Chirag"), Student("Solanki")),
            layoutRes = R.layout.row_layout,
            bindFunc = { view, item -> view.findViewById<Button>(R.id.devButton).text = item.fname },
            clickListener = { item -> onItemClick(item.fname) }
        )


    }

    private fun onItemClick(item: String) {
        printLog(item)
    }
}
data class Student(val fname:String);

