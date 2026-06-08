package Strings

object checkPangram extends App{
   val s = Set('a' ,'b' ,'c','d','e','f','g','h','i','j','k','l',
               'm','n','o','p','q','r','s','t','u','v','w','x','y','z')
   val sen: String = "Thequickbrownfoxjumpsoverthelazydog".toLowerCase

   val setSen = sen.toSet


   val ans = if ( setSen == s){
    "Panagram"
   }else{
    "Not Panagram"
   }

   println(ans)

}
