package ArrayVectroList

object sortedArray extends App{
       var arr = Array(6,8,-1,4,7,9,0,-3,-87)

       for  (i <- 0 to arr.length - 1 ){
            var mi = i
            for ( j <- i+1 until arr.length){
                if ( arr(j) < arr(mi)){
                   mi = j
                }
            }

            var temp = arr(i)
            arr(i) = arr(mi)
            arr(mi) = temp
       }

       println(arr.mkString("[",",","]"))

}
