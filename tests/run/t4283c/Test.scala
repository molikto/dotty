package b
object Test {
  def main(args: Array[String]): Unit = {
    val b = new a.B
    val c = b.t
    b.t = 10
  }
}
