package Recursions

object stringConcate extends App{
  def stringCon(num:Int , s:String , ans:String):String ={
      if ( num == 0){
        ans
      }
    else{
     ans + s
      stringCon(num -1 ,s,ans + s)
    }
  }
  var x = stringCon(3,"Litu","")
  println(x)
}
