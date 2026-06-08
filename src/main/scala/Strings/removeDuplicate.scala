package Strings

object removeDuplicate extends App{
  val r = "programming"
  var new_r = ""
  for  (ch <- r){
    if ( new_r.contains(ch) != true){
       new_r += ch
    }
  }
  println(new_r)

}
