import org.scalatest.funsuite.AnyFunSuite

class Question1Test extends AnyFunSuite{
  test(testName = "Find the max value in given tuple values"){
    assert(Question1.findMaxvalTuple((12,54,77), Question1.findMaxValue) == 77)
    println(assert(Question1.findMaxvalTuple((79,54,79), Question1.findMaxValue) == 79))
  }
}
