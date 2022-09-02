
const val PI = 3.1416 //NO DEBE CAMBIAR NUNCA | Declarar en tiempo de compilacion

    fun main(){
        //println("Hello World")

        var dinero = 10
        //println(dinero)
        dinero = 5
        //println(dinero)

        val nombre = "mario" //DECLARADO EN TIEMPO DE EJECUCION

        //val Boolean : Boolean = true
        val Boolean = true
        val numeroLargo : Long = 3L //para claculos matematicos muy grandes
        val double : Double = 2.8955
        val float : Float = 1.1f //se sule usar para calcuar el porcentaje de uminosidad de una vista

        //En kotlin todo es un objeto
        val primerValor = 10 //En tiempo de ejcucion Kotlin compila el valor y lo convierte en un tipo primitivo
        val segundoValor = 20
        //val tercerValor = primerValor - segundoValor
        //println(tercerValor)

        //usando template o interpolacion
        val apellido = "Mantilla"
        val melanie = "melanie"
        val nombreCompleto = "$melanie $apellido"
        //println(nombreCompleto)

        var integer: Int = 100
        var decimal: Double = 12.5

        integer = decimal.toInt()

        println(integer) //12

    }
