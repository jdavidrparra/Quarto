package com.quarto

import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatImageView

data class Room(var id: Int, var qid: Int, val view: RelativeLayout?, val size: Int, val rotated: Boolean) : Location(view, rotated) {

    val empty: Boolean get() { return qid == -1 }

    init {
        view?.findViewById<AppCompatImageView>(R.id.img_room)?.layoutParams?.let {
            it.width = size
            it.height = size
        }
    }

    private val img: AppCompatImageView? get() { return view?.findViewById(R.id.img_room) }

    fun quarto(quarto: Boolean) {
        if (quarto)
            img?.setImageResource(R.drawable.bg_rooms_quarto)
        else
            img?.setImageResource(R.drawable.bg_rooms)
    }

}