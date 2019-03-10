package com.janWroblewski.notepadex

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.note_row.view.*


class NotesAdapterView : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(viewGroup.context)
        val noteRow: View = layoutInflater.inflate(R.layout.note_row, viewGroup, false)
        return ViewHolder(noteRow)

    }

    override fun getItemCount(): Int {
        return UserNotesBase.noteTitle.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val noteTitle = holder.v.title_note_text_view
        val noteBody = holder.v.body_note_text_view


        noteTitle.setText(UserNotesBase.noteTitle[position])
        noteBody.setText(UserNotesBase.noteBody[position])

        holder.itemView.setOnClickListener {


            removeTitleNote(position)
            Log.d("tag", "clicked")

        }

    }
}

class ViewHolder(val v: View) : RecyclerView.ViewHolder(v) {


}