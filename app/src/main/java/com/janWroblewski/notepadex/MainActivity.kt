package com.janWroblewski.notepadex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_row.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view_notes.layoutManager = LinearLayoutManager(this)
        recycler_view_notes.adapter = NotesAdapterView()


        add_new_note_float_btn.setOnClickListener {

            Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AddNewNote::class.java)
            startActivity(intent)


        }



//        delete_note_btn.setOnClickListener {
//
//            //removeTitleNote()
//        }


    }
}
