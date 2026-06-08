package ArrayVectroList

object leadersElement extends App{

       var arr = Array[Int](2,17,8,6,7,3,4,1)

       var narr = Array[Int]()

       for ( i <- 0 until arr.length - 1){
           if ( arr(i) > arr.slice(i+1,arr.length).max){
              narr = narr :+ arr(i)
           }
       }

       println(narr)
}
