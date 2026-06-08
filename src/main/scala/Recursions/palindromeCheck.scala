package Recursions

import scala.annotation.tailrec
import scala.io.StdIn._
object checking {
  @tailrec
  def palindrome(w:String, cumm:String) :String = {
      if ( w.isEmpty ){
         cumm 
      }else{
       
        palindrome(w.tail, w.head + cumm)
      }
  }

}

object palindromeCheck extends App{
   print("Enter the word: ")
   val w = readLine()
   
   var check = checking.palindrome(w,"")
   
   if (check  == w){
     println("its palindrome")
   }
   else{
     println("its not")
   }
   

}
