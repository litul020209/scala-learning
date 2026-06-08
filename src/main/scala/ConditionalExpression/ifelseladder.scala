package ConditionalExpression

object ifelseladder extends  App{
  val x = 19
  if (x >= 18){
    println("Eligible for vote")
  }
  else{
    println("Not Eligible for vote")
  }

  if(x == 18){
    println("18 years old")
  }
  else if(x == 19){
    println("19 years old")
  }
  else{
    println("check the age")
  }
}
