package com.solutelabs.extension_session_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solutelabs.extension_session_sample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.buttonMain.onClick {
            withPermissions(
                android.Manifest.permission.READ_EXTERNAL_STORAGE,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
                android.Manifest.permission.CAMERA,
            ) {
                toast("Permission Granted")
            }

        }




    }


}


