package ConditionalExpression

object matchExpression extends  App{
  val day = 7

  val res = day match{
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
    case 7 => "Saturday"
  }
  println(res)
}
