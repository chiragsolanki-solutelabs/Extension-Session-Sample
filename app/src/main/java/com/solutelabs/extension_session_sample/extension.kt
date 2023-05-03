package com.solutelabs.extension_session_sample

import android.util.Log


fun Any?.printLog(tag: String = "Debug_Tag") {
    Log.e(tag, toString())
}