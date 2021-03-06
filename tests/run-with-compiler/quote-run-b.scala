
import scala.quoted._

object Test {
  def main(args: Array[String]): Unit = {
    implicit val toolbox: scala.quoted.Toolbox = scala.quoted.Toolbox.make(getClass.getClassLoader)
    def lambdaExpr given QuoteContext = '{
      (x: Int) => println("lambda(" + x + ")")
    }
    println()

    val lambda = run(lambdaExpr)
    lambda(4)
    lambda(5)
  }
}
