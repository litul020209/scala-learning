package Oops.ClassAndObject

object Counter extends App{
    val nc =new Counter(5)
    println(nc.c)

    val nc1 = nc.inc
    println(nc1.c)

}

class Counter(val c : Int) {
    def inc:Counter ={
        new Counter(c+ 1 )
    }

    def dec:Counter = {
        new Counter(c - 1)
    }
     
    def inc(n:Int):Counter = {
        if ( n <= 0) this
        else inc.inc(n - 1)

    }

    def dec(n:Int):Counter ={
        if (n <= 0) this
        else dec.dec(n-1)
    }

}
