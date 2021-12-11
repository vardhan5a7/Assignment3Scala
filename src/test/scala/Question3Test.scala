import org.scalatest.funsuite.AnyFunSuite

class Question3Test extends AnyFunSuite{

  test(testName = "using higher order function pass the function and return function"){
    val f = Question3.productValue((x: Int) => x)
    val f1 = Question3.productValue(Question3.takeValue)
    assert(f(4) == 12)
    assert(f1(2) == 6)
  }
}
