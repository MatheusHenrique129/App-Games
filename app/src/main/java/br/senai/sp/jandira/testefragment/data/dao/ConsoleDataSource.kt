package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.model.Game

class ConsoleDataSource {

    companion object{
        fun getConsoles(context: Context) : ArrayList<Console> {
            var consoles = ArrayList<Console>()

            consoles.add(Console(
                1,
                "Xbox 360",
                "Microsoft",
                "2005-01-01",
                "Jogar Não Tem Limites Desfrute do carregamento extremamente rápido com o SSD de altíssima velocidade, uma imersão mais profunda com suporte a feedback tátil, gatilhos adaptáveis e áudio 3D, além de uma geração inédita de jogos incríveis para Playstation. Domine o poder de uma CPU e GPU personalizadas e o SSD com E/S integradas que redefinem as regras do que o console Playstation pode fazer.",
                context.getDrawable(R.drawable.play_5)!!
            ))

            consoles.add(Console(
                2,
                "Xbox One",
                "Microsoft",
                "2005-01-01",
                "fsdufnfuetgreygr4tyh",
                context.getDrawable(R.drawable.play_5)!!
            ))

            consoles.add(Console(
                3,
                "Xbox Series X",
                "Microsoft",
                "2005-01-01",
                "JFNEUEUFGURGRRGUUG",
                context.getDrawable(R.drawable.play_5)!!
            ))

            consoles.add(Console(
                4,
                "Playstation 3",
                "Sony",
                "2005-01-01",
                "JFNEUEUFGURGRRGUUG",
                context.getDrawable(R.drawable.play_5)!!
            ))

            consoles.add(Console(
                5,
                "Playstation 4",
                "Sony",
                "2005-01-01",
                "JFNEUEUFGURGRRGUUG",
                context.getDrawable(R.drawable.play_5)!!
            ))

            consoles.add(Console(
                6,
                "Playstation 5",
                "Sony",
                "2005-01-01",
                "JFNEUEUFGURGRRGUUG",
                context.getDrawable(R.drawable.play_5)!!
            ))

            return consoles
            
        }
    }
}