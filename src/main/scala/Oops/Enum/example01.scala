package Oops.Enum

object example01 extends  App{

  enum Permissions {
    case READ, WRITE, EXECUTE

    // methods

    def openRead():Permissions = Permissions.READ
  }

   val p: Permissions = Permissions.READ

   println(p.openRead())

//   enum Verify( num: Int) {
//     
//   }


}