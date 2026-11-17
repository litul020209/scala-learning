object Main {

  def main(args: Array[String]): Unit = {

    var  s = "Heelole"
    
    var eIndex = Array[Int]()

    for (i <- 0 to s.length-1){
      if (s(i) == 'e'){
        eIndex :+ i
      }
    }
    
    var p = eIndex(0)

    var ans : Array[Int] = Array[Int]()

    for ( i <- 0 to s.length - 1 ){

        if (s(i) != 'e') {
           
        }

    }

  }
}