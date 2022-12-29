package com.ankit.androidextensions

import android.widget.Toast
import androidx.fragment.app.Fragment
import java.lang.Exception

fun Fragment.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    requireContext().toast(message, length)
}

/**
 * Return true if removed else false.
 */
fun Fragment.removeChildFragment(tag: String): Boolean {
    return try {
        childFragmentManager.findFragmentByTag(tag)?.let {
            childFragmentManager.beginTransaction().remove(it).commitNow()
            true
        } ?: false
    } catch (e: Exception) {
        e.printStackTrace()
        false
    }
}

/**
 * Return true if removed else false.
 */
fun Fragment.removeChildFragment(id: Int): Boolean {
    return try {
        childFragmentManager.findFragmentById(id)?.let {
            childFragmentManager.beginTransaction().remove(it).commitNow()
            true
        } ?: false
    } catch (e: Exception) {
        e.printStackTrace()
        false
    }
}