package Strings


object Solution extends App{

    def shortestToChar(s: String, c: Char): Unit= {
        
        var l = s.split("")

        print(l.mkString("[",",","]"))
        
    }

    var s = "loveleetcode"

    var c = 'e'

    shortestToChar(s,c)
}