package ArrayVectroList

object MapFIlter extends App {

    var arr:Array[Int] =  Array(1,2,3,4,5)

    println(arr.mkString("["," , ","]"))

    var arr1 = arr.map(x => x * 2)

    println(arr1.mkString("["," , ","]"))

    var arr2 = arr.filter(x => x > 2)

    println(arr2.mkString("["," , ","]"))

    var arr3 = arr.reduce((x , y) => x * y)

    println(arr3)

    var arr4 = arr.forall(x => x != 5)

    var arr5 = arr.exists(x => x % 2 == 0)

    println(arr5)

    var arr10:Array[Int] =  Array(1,2,3,1,1,1,4,5)

    var arr6:Int = arr10.count(x => x == 1)

    println(arr6)
}