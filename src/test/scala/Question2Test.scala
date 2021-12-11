import org.scalatest.funsuite.AnyFunSuite

import scala.util.Random
import util.Random._
class Question2Test extends AnyFunSuite{


  test(testName = "Find max value , Min value and return the least value"){
    assert(Question2.findMaxValue(2,4) == 4)
    assert(Question2.findMinValue(2,4) == 2)
    assert(Question2.returnLastValue(3,7) == 7)


  }
}
