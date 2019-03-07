package com.janWroblewski.notepadex

import android.widget.Toast
import com.janWroblewski.notepadex.UserNotesBase.noteBody
import com.janWroblewski.notepadex.UserNotesBase.noteTitle

fun addTitleBodyNote(title: String, body: String) {
    noteTitle.add(title)
    noteBody.add(body)

}
//
//fun removeTitleNote(position: Int) {
//
//    noteTitle.removeAt(position)
//    noteBody.removeAt(position)
//
//}

