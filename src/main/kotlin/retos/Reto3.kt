package retos


/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */
class Reto3 {

    fun generadorPass(lenght:Int = 8, mayus: Boolean = false, nums: Boolean = false, simb: Boolean = false){
        val numRamdom = 33 .. 126
        val lenghtPassword: Int = (8 .. 16).random()
        var password = ""

        println(lenght)//TO-DO: capturar error de longitud máxima y mínima
        if(lenght in 8..16){
            var type = mutableListOf(0, if (mayus) 1 else -1, if (nums) 2 else -1, if (simb) 3 else -1)
            while (type.contains(-1)){
                type.remove(-1)
            }
            for (element in 0 until lenght){

                var charType = (type).random()

                when(charType){
                    0->{
                        password += randomChar(97, 122)
                    }
                    1 ->{
                        password += randomChar(65, 90)
                    }
                    2 ->{
                        password += randomChar(48, 57)
                    }
                    3 ->{
                        password += randomChar(33, 48)
                    }
                }
            }
            println(password)
        } else {
            println("Tamaño de contraseña incorrecto")
        }
    }

    fun randomChar(n1:Int, n2:Int): Char{
        val numRamdom = (n1 .. n2).random()
        return numRamdom.toChar()

    }
}