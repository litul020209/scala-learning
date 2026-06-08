package Strings

object balanceParanthesis extends App{
  val p = "[(])"

  var arr1 = Array[Char]()

  for (c <- p){
    if ( c == '(' || c == '{' || c == '[' ) {
      arr1 = arr1 :+ c

    }
    else if (c == ']') {
      if (arr1(arr1.length - 1) == '[') {
        arr1 = arr1.dropRight(1)
      }

    }
    else if (c == ')') {
      if (arr1(arr1.length - 1)== '(') {
        arr1 = arr1.dropRight(1)
      }

    }
    else if (c == '}') {
      if (arr1(arr1.length - 1) == '{') {
        arr1 = arr1.dropRight(1)
      }

    }
  }

  if (arr1.length == 0){
    println("balanced ")
  }else{
    println("un balanced ")
  }

}
