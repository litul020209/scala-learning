package Strings

object countWordsInSentence extends App{
   var s = " Hello Ray Business Technologies "
   s = s.trim
   var k = 0
   for (c <- s){
     if (c == ' '){
       k += 1
     }
   }
   println(s"The total words is ${k +1}")

}
