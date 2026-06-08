package TupleDatatype

object tupleMethods extends App{
  var t = (1,"Biswa","Prakash",2,true)
  println(t)

  println(t.productArity)
  println(t.productElement(1))
  println(t.productPrefix)
  println(t.productElementNames)

}
