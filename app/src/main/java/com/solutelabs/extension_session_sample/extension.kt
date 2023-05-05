package com.solutelabs.extension_session_sample

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.app.Activity
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0


fun Any?.printLog(tag: String = "Debug_Tag") {
    Log.e(tag, toString())
}


// --------- View Extension ------------
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

// --------- Toast Extension ------------
fun Fragment.toast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
}

fun Fragment.toast(@StringRes message: Int) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
}

fun Activity.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Activity.toast(@StringRes message: Int) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

// --------- Snackbar Extension ------------

fun View.snackbar(message: String, duration: Int = Snackbar.LENGTH_LONG) {
    Snackbar.make(this, message, duration).show()
}

fun View.snackbar(@StringRes message: Int, duration: Int = Snackbar.LENGTH_LONG) {
    Snackbar.make(this, message, duration).show()
}

// --------- Hide Keyboard Extension ------------
fun Activity.hideKeyboard() {
    val imm: InputMethodManager =
        getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    val view = currentFocus ?: View(this)
    imm.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
}

fun Fragment.hideKeyboard() {
    activity?.apply {
        val imm: InputMethodManager =
            getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        val view = currentFocus ?: View(this)
        imm.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    }
}

// --------- Digit, Alphabetic, and Alphanumeric Check Extension ------------

val String.isDigitOnly: Boolean
    get() = matches(Regex("^\\d*\$"))

val String.isAlphabeticOnly: Boolean
    get() = matches(Regex("^[a-zA-Z]*\$"))

val String.isAlphanumericOnly: Boolean
    get() = matches(Regex("^[a-zA-Z\\d]*\$"))

// --------- Date formatter extension Extension ------------
fun String.toDate(format: String = "yyyy-MM-dd HH:mm:ss"): Date? {
    val dateFormatter = SimpleDateFormat(format, Locale.getDefault())
    return dateFormatter.parse(this)
}

fun Date.toStringFormat(format: String = "yyyy-MM-dd HH:mm:ss"): String {
    val dateFormatter = SimpleDateFormat(format, Locale.getDefault())
    return dateFormatter.format(this)
}

fun View.onClick(action: () -> Unit) {
    setOnClickListener { action() }
}