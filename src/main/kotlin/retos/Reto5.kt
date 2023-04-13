package retos

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */

class Reto5 {
    fun game(combinaciones: Array<String>){
        var p1 = 0
        var p2 = 0
        var punto:Boolean = true
        for (i in combinaciones.indices){
            var otP1 = combinaciones[i].split(", ")[0]
            var otP2 = combinaciones[i].split(", ")[1]
            when(otP1.lowercase()){
                "piedra"-> punto = piedra(otP2)
                "papel"-> punto = papel(otP2)
                "tijera"-> punto = tijera(otP2)
                "lagarto"-> punto = lagarto(otP2)
                "spock"-> punto = spock(otP2)
            }
            if (punto){
                p1++
            }else{
                p2++
            }

        }

        if (p1 == p2){
            println("Tier")
        }else{
            if(p1 > p2){
                println("Player1")
            }else{
                println("Plryer2")
            }
        }

    }

    fun piedra(option:String): Boolean{ var resp: Boolean
        return option.lowercase() == "spock" || option.lowercase() == "tijeras"
    }

    fun papel(option:String): Boolean{
        return option.lowercase() == "spock" || option.lowercase() == "tijeras"
    }

    fun tijera(option:String): Boolean{
        return option.lowercase() == "lagarto" || option.lowercase() == "papel"
    }

    fun spock(option:String): Boolean{
        return option.lowercase() == "tijera" || option.lowercase() == "lagarto"
    }

    fun lagarto(option:String): Boolean{
        return option.lowercase() == "spock" || option.lowercase() == "papel"
    }
}