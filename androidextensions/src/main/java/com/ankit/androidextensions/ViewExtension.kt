package com.ankit.androidextensions

import android.view.View

fun View.visibleOrGone(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE
    else View.GONE
}

fun View.visibleOrInvisible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE
    else View.INVISIBLE
}

fun View.requestFocusWithDelay(delay: Long = 100) {
  this.postDelayed({
      this.requestFocus()
  }, delay)
}

fun View.setWidth(width: Int) {
    val newLayoutParams = layoutParams
    newLayoutParams?.width = width
    layoutParams = newLayoutParams
}

fun View.setHeight(height: Int) {
    val newLayoutParams = layoutParams
    newLayoutParams?.height = height
    layoutParams = newLayoutParams
}

fun View.setWidthAndHeight(width: Int, height: Int) {
    val newLayoutParams = layoutParams
    newLayoutParams?.height = height
    newLayoutParams?.width = width
    layoutParams = newLayoutParams
}