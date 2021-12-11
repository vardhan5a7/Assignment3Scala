object Question4 extends App {

  def fzero[A] (x: A) (f: A => Unit): A = {f(x); x}

  def subFun[A](a: Int): Unit = println(a * 2)

  fzero(3)(subFun)
}
