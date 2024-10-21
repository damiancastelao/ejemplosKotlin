/**
 * Ejemplo de funciones en Kotlin
 * Utilizamos valores por defecto
 */

fun main() {
    // llamada a una funcion tradicional
    suma(2,3)

    // llamada nombrando los parametros
    // el valor de 'a' será el por defecto
    suma(b=12)
}

/**
 * Declaración de función en Kotlin
 * fun: palabra reservada para designar las funciones
 * Unit: es lo equivalente a void
 * @param a un sumando, valor por defecto 0
 * @param b otro sumando
 */
fun suma (a: Int=0, b: Int): Unit {
    // suma los dos parámetros
    val resultado = a+b
    println("El resultado es: $resultado")
}