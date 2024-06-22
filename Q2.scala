object main{
    def main(arge : Array[String]) : Unit = {
        var a : Int = 2
        var b : Int = 3
        var c : Int = 4
        var d : Int = 5
        var k : Float = 4.3f
        var g : Float = 4.0f //"g" is not given in question

        //Evaluations
        b -= 1 //pre decrement doesnt support in scala
        //d remains same because it post decremented
        print("1. - -b * a + c *d - - = ")
        println(b * a + c *d)
        d -= 1 //post decrement
        a += 1 //pre increment
        print("2. a++ = ")
        println(a);
        print("3. -2 * ( g - k ) +c = ")
        println(-2 * ( g - k ) + c )
        print ("4. c = c++ = ")
        println(c)
        c += 1 //post increment
        c += 1//pre increment
        print("5. c = ++c * a++ = ")
        c = c * a 
        print(c)
        a += 1 //post increment
    }
}