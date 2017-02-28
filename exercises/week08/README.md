#Transformation of Sequences

## Four major transformation functions: map, flatMap, fold, foreach.

###### FP -> zip, fold, filter, map, ..
```
We have          We provide          We want          Method
-------          ----------          -------          ------
Seq[A]           A => Unit           Unit             foreach
Seq[A]           A => B              Seq[B]           map
Seq[A]           A => Seq[B]         Seq[B]           flatMap
Seq[A]           B and (B,A) => B    B                foldLeft
Seq[A]           B and (A,B) => B    B                foldRight
```
**Examples:**
```
scala> Seq(1,2,3).map(_ * 2)
res0: Seq[Int] = List(2, 4, 6)

scala> for {
     | x <- Seq(1,2,3)
     | } yield x * 2
res0: Seq[Int] = List(2, 4, 6)

scala> val data = Seq(Seq(1), Seq(2,3), Seq(4,5,6))
data: Seq[Seq[Int]] = List(List(1), List(2, 3), List(4, 5, 6))

scala> data.flatMap(_.map(_ * 2))
res1: Seq[Int] = List(2, 4, 6, 8, 10, 12)

scala> for {
     | subseq <- data
     | element <- subseq
     | } yield element * 2
res1: Seq[Int] = List(2, 4, 6, 8, 10, 12)

scala> val newdata = Seq(data, data, data)
newdata: Seq[Seq[Seq[Int]]] = List(List(List(1), List(2, 3), List(4, 5, 6)), List(List(1), List(2, 3), List(4, 5, 6)), List(List(1), List(2, 3), List(4, 5, 6)))

scala> newdata.flatMap(_.flatMap(_.map(_ * 2)))
res2: Seq[Int] = List(2, 4, 6, 8, 10, 12, 2, 4, 6, 8, 10, 12, 2, 4, 6, 8, 10, 12)

scala> newdata.flatMap(x => x.flatMap(y => y.map(z => z * 2)))
res3: Seq[Int] = List(2, 4, 6, 8, 10, 12, 2, 4, 6, 8, 10, 12, 2, 4, 6, 8, 10, 12)

scala> for {
     | x <- newdata
     | y <- x
     | z <- y
     | } yield z * 2
res4: Seq[Int] = List(2, 4, 6, 8, 10, 12, 2, 4, 6, 8, 10, 12, 2, 4, 6, 8, 10, 12)

scala> for {
     | x <- newdata
     | y <- x
     | z <- y
     | } println(z * 2)
2
4
6
8
10
12
2
4
6
8
10
12
2
4
6
8
10
12


```