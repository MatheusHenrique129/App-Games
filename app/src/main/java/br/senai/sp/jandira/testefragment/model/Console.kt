package br.senai.sp.jandira.testefragment.model

import android.graphics.drawable.Drawable

data class Console(
    var id: Long,
    var consoleName: String,
    var consoleMaker: String,
    var consoleReleaseDate: String,
    var consoleDescription: String,
    var consoleImage: Drawable
)