package com.janWroblewski.notepadex

import android.app.Activity
import android.widget.Toast
import java.time.Duration

fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
