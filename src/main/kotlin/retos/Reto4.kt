package retos


/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */
class Reto4 {

    fun resultReto4(num: Int){
        println("El número "+num+":"+esPar(num)+esPrimo(num)+esFibonacci(num))

    }

    private fun esFibonacci(num: Int): String {
        var fibo = arrayOfNulls<Int>(100)
        for (i in 0 until 100){
            if(i == 0 || i == 1){
                fibo[i] = i
            }else{
                var aux = i
                fibo[i] =  fibo.get((i-1))!! + fibo.get((i-2))!!
            }
        }

        if (fibo.contains(num)){
            return " es fibonacci"
        }else{
            return " no es fibonacci"
        }
    }

    private fun esPrimo(num: Int): String {

        if (num % 1 != 0 && num % num != 0){
            println(num.toFloat() % 1)
            println(num.toFloat() % num.toFloat())
            return " no es primo,"
        }else{
            return " es primo,"
        }
    }

    private fun esPar(num: Int): String {
        if (num % 2 == 0){
            return " es par,"
        }else{
            return " no es par,"
        }
    }
}