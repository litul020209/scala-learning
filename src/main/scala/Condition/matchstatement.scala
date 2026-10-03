package Condition

object MatchStatements extends  App{

    val res1 = if(5 == 5){
        5
    }
    else{
        0
    }

   val ans =  res1 match {
        case 1 => 5
        case 5 => 6
    }

    println(ans)
    

}