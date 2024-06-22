object main{
    def main (args : Array[String]): Unit = {

        //Declaring Variables & Assigning Values
        var i, j, k : Int = 2
        var m,n : Int = 5
        var f : Float = 12.0f
        var g : Float = 4.0f
        var c : Char = 'X'

        //Calculations
        val a = k + 12 * m
        println("k + 12 * m = " + a)
        val b = m / j
        println("m / j = " + b)
        val y = n % j
        println("n % j = " + y)
        val d = m / j * j
        println("m / j * j = " + d)
        val e = f + 10 * 5 + g
        println("f + 10*5 +g = " + e )

        i += 1 // Scala doesn't have a ++ operator(but Java have)
        val z = i * n
        println("++i * n = " + z)
    }
}