package Strings
import scala.io.StdIn._


object reverseString extends App{
    print("Enter the string: ")
    var s = readLine()
    println(s)
    var new_s = s.reverse
    println(new_s)
    
//  palindrome or not
    if (s == new_s){
      println("Palindrome")
    } 
    else{
      println("not palindrome")
    }


}
