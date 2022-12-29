package com.ankit.androidextensions

import androidx.fragment.app.FragmentActivity
import java.lang.Exception

/**
 * Return true if removed else false.
 */
fun FragmentActivity.removeFragment(tag: String): Boolean {
    return try {
        supportFragmentManager.findFragmentByTag(tag)?.let {
            supportFragmentManager.beginTransaction().remove(it).commitNow()
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
fun FragmentActivity.removeFragment(id: Int): Boolean {
    return try {
        supportFragmentManager.findFragmentById(id)?.let {
            supportFragmentManager.beginTransaction().remove(it).commitNow()
            true
        } ?: false
    } catch (e: Exception) {
        e.printStackTrace()
        false
    }
}