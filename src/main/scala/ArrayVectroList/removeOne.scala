package ArrayVectroList

object removeOne extends App{

  var arr = Array[Int](1,2,10,5,7)

  var mx = arr.max

  var newArr = arr.filter( x => x != mx)

  if (newArr.sameElements(newArr.sorted)){
    println(true)
  }else{
    println(false)
  }


}
