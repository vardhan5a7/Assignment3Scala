import org.scalatest.funsuite.AnyFunSuite

class Question4Test extends AnyFunSuite{

  test(testName = "Take the function definition and use the full fill function"){
    assert(Question4.fzero(3)(Question4.subFun) == 3)
  }
}
