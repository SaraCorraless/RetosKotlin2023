package retos


/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

class Reto2 {
    fun lenguajeHacker(mensaje: String){
        val hackerMap = mapOf("A" to "4", "B" to "6", "C" to "(", "D" to "[)", "E" to "&", "F" to "]]=", "G" to "&", "H" to "#", "I" to "!", "J" to ".|",
            "K" to "]{", "L" to "#", "M" to "(\\/)", "N" to "(\\)", "O" to "()", "P" to "[]D", "Q" to "(,)",
            "R" to "1ª", "S" to "$", "T" to "'|'", "U" to "(_)", "V" to "\\/", "W" to "'//'", "X" to "%", "Y" to "'/", "Z" to "''/_")
        var mensajeHack = ""
        for (element in mensaje){
            if (hackerMap.containsKey(element.uppercase())){
                mensajeHack += hackerMap[element.uppercase()].toString()
            }else{
                mensajeHack += element
            }

        }
        println(mensajeHack)
    }
}