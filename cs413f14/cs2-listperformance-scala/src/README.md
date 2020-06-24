# Code COMPILES but does not finish - throws error: (I already tried playing around with array sizes: 1 to n...0 to n) -

Exception in thread "main" java.lang.IndexOutOfBoundsException: 10
	at scala.collection.LinearSeqOptimized$class.apply(LinearSeqOptimized.scala:52)
	at scala.collection.immutable.List.apply(List.scala:84)
	at Performance$$anonfun$main$1$$anonfun$apply$mcVI$sp$1.apply$mcV$sp(Performance.scala:31)
	at Performance$$anonfun$main$1$$anonfun$apply$mcVI$sp$1.apply(Performance.scala:29)
	at Performance$$anonfun$main$1$$anonfun$apply$mcVI$sp$1.apply(Performance.scala:29)
	at Performance$$anonfun$main$1.timeThis$1(Performance.scala:51)
	at Performance$$anonfun$main$1.apply$mcVI$sp(Performance.scala:29)
	at Performance$$anonfun$main$1.apply(Performance.scala:28)
	at Performance$$anonfun$main$1.apply(Performance.scala:28)
	at scala.collection.immutable.List.foreach(List.scala:318)
	at Performance$.main(Performance.scala:28)
	at Performance.main(Performance.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:134)


# Answers

Here are the answers to the questions:

1 - Array list is quicker since we know (or assign) the MAX size ahead of time so we can store/access elements:  val DIM = List(10,100,1000,10000)
 ArrayList is backed by an array whereas ListBuffer is backed by LinkedList - http://stackoverflow.com/questions/6255738/difference-between-listbuffer-and-arraybuffer-in-scala


2 - Yes is does make a difference - in the unit test, we have an import of the library: import scala.collection.mutable.ArrayBuffer...therefore, we must make a NEW unit test for ListBuffer
 and also import this library - see FixtureListBuffer.scala class

3 - list -= 5 // what does this one do? >>>>  REMOVES the 5 elements from the list...