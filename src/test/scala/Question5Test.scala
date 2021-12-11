import org.scalatest.funsuite.AnyFunSuite

class Question5Test extends AnyFunSuite {

  test(testName = "To validate conditional function"){

    assert(Question5.conditional(4, Question5.checkBoolean, Question5.multiplay) == 16)
    assert(Question5.conditional(5, Question5.checkBoolean, Question5.multiplay) == 25)
  }
}
