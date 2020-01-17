class C extends A.B {
  def f() = "hello"
}

object Test {
  def main(args: Array[String]): Unit = {
    val c: A = new C
    println(c.f())
  }
}
