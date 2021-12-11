
object Question5 extends App{

  def conditional(n:Int, p: Int => Boolean, f: Int => Int): Int = if(p(n)) f(n) else n

  def checkBoolean(n: Int): Boolean = if(n >= 0) true else false

  def multiplay(n: Int): Int = n * n

  println(conditional(4,checkBoolean, multiplay))
}


