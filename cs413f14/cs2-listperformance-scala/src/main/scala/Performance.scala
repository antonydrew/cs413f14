import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Performance {

  val DIM = List(10,100,1000,10000)
  val REPS = 0
  //val elem = 1

  // TODO modify this program so that it runs for SIZE = 10, 100, 1000, 10000
  // and for both ArrayBuffer and ListBuffer

  // TODO answer this question: which of the two lists implementations performs better
  // as the size increases?


  def main(args: Array[String]): Unit = {

    val fixture = new ArrayBuffer[Int]
    val fixtureList = new ListBuffer[Int]

    val size = 10000

    for (i <- 0 to size) fixture += i
    for (i <- 0 to size) fixtureList += i



    for (elem <- DIM) {
      timeThis(fixture.getClass.getSimpleName + " size " + size + " random access") {
        var x = 0L
        for (r <- 1 to DIM(elem))
          x = fixture(r % DIM(elem))
      }
      timeThis(fixtureList.getClass.getSimpleName + " size " + size + " random access") {
        var x = 0L
        for (r <- 1 to DIM(elem))
          x = fixtureList(r % DIM(elem))
      }
      timeThis(fixture.getClass.getSimpleName + " size " + size + " add/remove") {
        for (r <- 1 to DIM(elem))
          fixture.insert(0, 77)
        fixture.remove(0)
      }
      timeThis(fixtureList.getClass.getSimpleName + " size " + size + " add/remove") {
        for (r <- 1 to DIM(elem))
          fixtureList.insert(0, 77)
        fixtureList.remove(0)
      }
      def timeThis[A](s: String)(block: => A): A = {
        val time0 = System.currentTimeMillis
        val b = block
        val time1 = System.currentTimeMillis - time0
        println("Timing " + s + " = " + time1)
        b
      }
    }



  }



}