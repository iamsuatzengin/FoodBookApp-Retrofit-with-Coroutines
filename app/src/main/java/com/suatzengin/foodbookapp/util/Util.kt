package com.suatzengin.foodbookapp.util

import android.widget.ImageView
import com.squareup.picasso.Picasso


fun ImageView.bindImage(url: String) {
    Picasso.get().load(url).into(this)
}
