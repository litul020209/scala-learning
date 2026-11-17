
package Strings

object SolutionSolve extends App {

    def toGoatLatin(s: String): String = {

        var v = Set[Char]('a','e','i','o','u','A','E','I','O','U')

        var arr = s.split(" ")

        val ans = new StringBuilder()

        var i = 1

        for (x <- arr) {

            if (v.contains(x(0))) {

                ans.append(x).append("ma")

            } else {

                ans.append(x.substring(1)).append(x(0)).append("ma")

            }

            ans.append("a" * i).append(" ")

            i += 1

        }

        ans.toString.trim
    }

    var s = "I speak Goat Latin"

    println(toGoatLatin(s))
}
