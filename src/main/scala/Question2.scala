import scala.util.Random
import scala.util.Random._

object Question2 extends App {

  val val1 = Random.nextInt()
  val val2 = Random.nextInt()

  def findMaxValue(a: Int, b: Int): Int = {
    if(a >= b) a else b
  }

  def findMinValue(a: Int, b: Int): Int = {
    if(a <= b) a else b
  }

  def returnLastValue(firstValue: Int, lastValue: Int): Int = lastValue

  def validateAllFunc(f: (Int, Int) => Int, g: (Int, Int) => Int, h: (Int, Int) => Int): Any = {
    var totalsum = 0
    totalsum += f(val1, val2) + g(val1, val2) + h(val1, val2)

    println(f(val1, val2))
    println(g(val1, val2))
    println(h(val1, val2))

  }

  validateAllFunc(findMaxValue, findMinValue, returnLastValue)
  println()
  println(val1)
  println(val2)
}
