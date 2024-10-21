/**
 * Ejemplo de funciones como parámetros
 */
fun main() {
    // llamamos a la funcion, el tercer parámetro es una funcion
    println("Llamada a sinParametros")
    sinParametros(
        // primer parámetro
        5,
        // segundo parámetro
        6,
        // tercer parámetro, una función
        {
            // variables dentro de la funcion
            val resul = 7 + 5
            println("La suma es $resul")
        }
    )
    println()
    // llamamos a la funcion, el tercer parámetro es una funcion
    println("Llamada a conParametros con una suma")
    conParametros (
        // primer parámetro
        5,
        // segundo parámetro
        6,
        // tercer parámetro, una función
        operacion = {x, y ->
            val resul = x + y
            println("La suma es $resul")
        }
    )
    println()
    println("Llamada a conParametros con una resta")
    // lo mismo con una resta
    conParametros (
        // primer parámetro
        5,
        // segundo parámetro
        6,
        // tercer parámetro, una función
        operacion = {x, y ->
            val resul = x - y
            println("La resta es $resul")
        }
    )
    println()
    println("Llamada a conParametros con valores por defecto")
    // lo mismo usando los valores por defecto
    conParametros (
        // tercer parámetro, una función
        operacion = {x, y ->
            val resul = x * y
            println("La multiplicación es $resul")
        }
    )

    println()
    println("Utilizando una estructura enum con las operaciones")
    // Utilizando una estructura enum con las operaciones
    for (boton in Botones.entries) {
        conParametros (boton.operando1, boton.operando2, boton.onClick)
    }

}

/**
 * Recibe por parámetro una función
 * @param a numero para hacer lo que querramos
 * @param b otro numero
 * @param operacion es una funcion que no tiene parámetros y no devuelve nada
 */
fun sinParametros(a: Int, b:Int, operacion:()->Unit) {
    println("Primer parametro $a")
    println("Segundo parametro $b")
    operacion()
}

/**
 * Recibe una función por parámetro con parámetros
 * @param a valor para usar en operacion
 * @param b otro valor para usar en operacion
 * @param operacion funcion que recibe dos parametros
 */
fun conParametros(a:Int = 0, b:Int = 0, operacion: (x: Int, y:Int) -> Unit) {
    println("Recibido $a y $b")
    operacion(a,b)
}

/**
 * Estructura enum con valores y funciones
 */
enum class Botones(val operando1:Int, val operando2:Int, val onClick: (x: Int, y: Int) -> Unit) {
    // definimos la suma
    SUMA(1,2, {x,y ->
        val resul = x + y
        kotlin.io.println("La suma es $resul")
    }),
    // definimos la resta
    RESTA(3, 4, {x,y ->
        val resul = x - y
        kotlin.io.println("La resta es $resul")
    }),
    // definimos la multiplicacion
    MULTIPLICACION(5, 6, {x,y ->
        val resul = x * y
        kotlin.io.println("La multiplicacion es $resul")
    })
}