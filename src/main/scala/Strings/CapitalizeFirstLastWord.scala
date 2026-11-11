package Strings

object CapitalizeWord extends App {

    def capitalizeWord(  s:String ): String = {
        
        var str1 = s.split(" ")
        
        var ans : String = ""

        for ( x <- str1){

            var l = x.length

            var y = x(0).toUpper

            val z = x(l - 1).toUpper

            var res = y + x.substring(1,l-1) + z

            ans = ans + res + " "
        }
        
        ans
    }

    val s = "Scala is powerful"
    print(capitalizeWord(s))

}