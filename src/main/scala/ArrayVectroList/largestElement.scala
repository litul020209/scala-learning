package ArrayVectroList

object largestElement extends App{
  var arr = Array(100,-5,7,87)
  var m = 10 * -10000000000L

  for (i <- arr){
    if (i > m){
      m = i
    }
  }
  println(m)
  
  var sm = 10 * -10000000000L
//  second largest element
  for ( i <- arr if i != m){
     if ( i > sm){
       sm = i
     }
  }
  println(sm)

}
