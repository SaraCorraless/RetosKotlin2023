package retos


/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */
class Reto4 {

    fun resultReto4(){
        esPar(3)
        esPrimo(4)
    }

    private fun esFibonacci(num: Int): Boolean {
        if (num % 2 == 0){
            println("Es fibonacci")
        }else{

        }
        return true
    }

    private fun esPrimo(num: Int): Boolean {
        if (num % 1 == 0 && num % num == 0){
            println("Es primo")
        }else{

        }
        return true
    }

    private fun esPar(num: Int): Boolean {
        if (num % 2 == 0){
            println("Es par")
        }else{

        }
        return true

    }
}