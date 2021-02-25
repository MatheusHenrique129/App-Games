package br.senai.sp.jandira.testefragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


    val textConsoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val textConsoleDescription = itemView.findViewById<TextView>(R.id.text_view_console_description)
    val imageConsole = itemView.findViewById<ImageView>(R.id.image_console)
    val textConsoleReleaseDate = itemView.findViewById<TextView>(R.id.console_release_date)

    fun bind(console: Console) {
        textConsoleName.text = console.consoleName
        textConsoleDescription.text = console.consoleDescription
        textConsoleReleaseDate.text = console.consoleReleaseDate
        imageConsole.setImageDrawable(console.consoleImage)
    }
}



