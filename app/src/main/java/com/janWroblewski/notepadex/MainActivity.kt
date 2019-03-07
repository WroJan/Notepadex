package com.janWroblewski.notepadex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_row.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view_notes.layoutManager = LinearLayoutManager(this)
        recycler_view_notes.adapter = NotesAdapterView()


//        delete_note_btn.setOnClickListener {
//
//            //removeTitleNote()
//        }





    }
}
