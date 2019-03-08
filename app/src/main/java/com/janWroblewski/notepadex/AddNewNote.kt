package com.janWroblewski.notepadex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.janWroblewski.notepadex.UserNotesBase.noteBody
import com.janWroblewski.notepadex.UserNotesBase.noteTitle
import kotlinx.android.synthetic.main.add_new_note.*

class AddNewNote : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_note)

        new_note_body_title_btn.setOnClickListener {

            var noteTitleAdd = new_note_title.text.toString()
            var noteBodyAdd = new_note_body.text.toString()

            addTitleBodyNote(noteTitleAdd, noteBodyAdd)

            Log.d("adding", "$noteTitle and $noteBody")

            finish()

        }
    }


}