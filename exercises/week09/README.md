scala> new Singleton()
res0: Singleton = Singleton()

scala> val thing = new Singleton()
thing: Singleton = Singleton()

scala> val thing2 = new Singleton()
thing2: Singleton = Singleton() // creating a class 

scala> thing == thing2
res1: Boolean = true

scala> thing eq thing2
res2: Boolean = false

scala> thing equals thing2
res3: Boolean = true

scala> val one = Singleton
one: Singleton.type = Singleton // .type is an object

scala> val two = Singleton
two: Singleton.type = Singleton

scala> one == two
res4: Boolean = true

scala> one eq two
res5: Boolean = true

scala> one equals two
res6: Boolean = true