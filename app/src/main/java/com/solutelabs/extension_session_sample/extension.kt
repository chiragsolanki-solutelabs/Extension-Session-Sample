package com.solutelabs.extension_session_sample

import android.util.Log
import android.view.View


fun Any?.printLog(tag: String = "Debug_Tag") {
    Log.e(tag, toString())
}

fun View.gone() = run { visibility = View.GONE }

fun View.visible() = run { visibility = View.VISIBLE }

fun View.invisible() = run { visibility = View.INVISIBLE }

//Infix function is used to call without period or bracket,
infix fun View.visibleIf(condition: Boolean) =
    run { visibility = if (condition) View.VISIBLE else View.GONE }

infix fun View.goneIf(condition: Boolean) =
    run { visibility = if (condition) View.GONE else View.VISIBLE }

infix fun View.invisibleIf(condition: Boolean) =
    run { visibility = if (condition) View.INVISIBLE else View.VISIBLE }