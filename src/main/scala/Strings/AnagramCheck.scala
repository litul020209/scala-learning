package Strings

object AnagramCheck extends App{
     var s1 = "listen"
     var s2 = "silen"

     if ( s1.length == s2.length){
        if ( s1.toSet == s2.toSet ){
           println("Anagram")
        }
        else{
          println("Not an Anagram")
        }
     }
     else{
       println("Not an anagram")
     }

}
