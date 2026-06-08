package Oops.ClassAndObject

object WriterAndNovel extends App{
       val s = new Writer("Litu" , "Biswal" , 2003)
       val n = new Novel("King Maker" , 2026 , s)

       println(n.isWrittenBy(s))

}

class Writer(val name:String , val surname: String , val year:Int) {
  def fullname:String = name + surname

}
class Novel(val name:String , val release:Int , val author:Writer) {
  def authorAge:Int=  release - author.year
  def isWrittenBy(author:Writer) :Boolean = author == this.author

}