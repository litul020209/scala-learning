package Strings

object ReverseWord extends App{

    def reverseWord(  s:String ): String = {
        var str1 = s.split(" ")
        
        var ans : String = ""

        for ( x <- str1){
            var y = x.reverse
            ans = ans + y  + " "
        }
        
        ans
    }

    val s = "Scala is powerful"
    print(reverseWord(s))
}


