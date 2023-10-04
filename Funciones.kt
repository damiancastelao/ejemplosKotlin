fun main(args: Array<String>) {
    // llamada a una funcion tradicional
    suma(2,3)

    // llamada nombrando los parametros
    // el valor de 'a' será el por defecto
    suma(b=12)
    
    // llamamos a la funcion, pasandole, los números
    // y tambien el tercer parámetro, que es una funcion
    FuncionOperacion(
        // primer parámetro
        5,
        // segundo parámetro
        6,
        // tercer parámetro, una función
        fun (x,y) {
            val resul = x + y
            println("La suma es $resul")
        }
    )

    // llamamos a la funcion, pasandole, los números
    // y tambien el tercer parámetro, que es una funcion resta esta vez
    FuncionOperacion(
        // primer parámetro
        10,
        // segundo parámetro
        4,
        // tercer parámetro, una función
        fun(x,y){
            val resul = x + y
            println("La resta es $resul")
        }
    )

    // llamamos a la ultima funcion
    FuncionOperacionUnParametro(a=4, b=5, fun() { println("Hago algo")})

    // la volvemos a llamar
    // pero ahora le quitamos 'fun' ya que es redundante
    FuncionOperacionUnParametro (a=10, b=20) {
        print("puedo escribirlo fuera de los parentesis")
        println("ya que soy el último parámetro")
    }

    // usando los valores de los parámetros por defecto
    // esta es la forma que nos aparece mucho en las funciones @Compose
    FuncionOperacionUnParametro (b=9) {
        println("Solo un parametro")
    }

    // podemos no usar los parentesis si no mandamos parametros
    FuncionOperacionUnParametro { println("Sin parentesis") }
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

/**
 * Recibe por parámetro una función
 * Opera con los parametros
 * @param a numero para operar
 * @param b el otro numero paraoperar
 * @param operacion funcion que será una operacion entre los dos números
 *                  esta función tiene que recibir dos enteros por parámetros
 */
fun FuncionOperacion(a: Int, b:Int, operacion:(x:Int,y:Int)->Unit) {
    // con los parametros recibidos (a,b) se los pasamos a la funcion tambien recibida
    operacion(a,b)
}

/**
 * Recibe una función por parámetro que no tiene solo un parámetro parámetros
 * @param a un valor que tiene un valor por defecto
 * @param b otro valor que tiene otro valor por defecto
 * @param operacion funcion que no recibe parametros
 */
fun FuncionOperacionUnParametro(a:Int = 10, b:Int = 5, operacion: () -> Unit) {
    println("Recibido $a y $b")
    operacion()
}