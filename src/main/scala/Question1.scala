object Question1 {

  def findMaxValue(a: Int, b: Int): Int = {
    if(a >= b) a else b
  }

  def findMaxvalTuple(tuple: (Int, Int, Int), f:(Int, Int) => Int): Int = {

    f(tuple._1, f(tuple._2, tuple._3))

  }

  println(findMaxvalTuple((12,54,77), findMaxValue))
}
