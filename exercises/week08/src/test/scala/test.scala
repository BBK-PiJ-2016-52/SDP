def f(xs: List[Int], g:(Int, Int)=> Boolean)={
def h(x: Int, xs: List[Int]): List[Int] =
xs match{
case List() => List(x)
case y :: ys => if (!g(x,y)) x :: xs else y :: h(x,ys)
}
(xs :\List[Int]())(h)
}