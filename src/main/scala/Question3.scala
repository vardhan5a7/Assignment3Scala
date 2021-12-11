object Question3 extends App{

  def takeValue(n: Int): Int = {
    n
  }

  def productValue(f: Int => Int): Int => Int = {

    (x: Int) => f(3) * x

  }

  val call = productValue(takeValue)
  println(call(4))
}
