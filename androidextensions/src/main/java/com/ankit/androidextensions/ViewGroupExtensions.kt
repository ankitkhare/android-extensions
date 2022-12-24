package com.ankit.androidextensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflateLayout(layoutId: Int): View {
    return LayoutInflater.from(context).inflate(layoutId, this, false)
}