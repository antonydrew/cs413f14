package cs271.lab.list

import scala.collection.mutable.ListBuffer

object FixtureListBuffer {

  // TODO also try with a ListBuffer
  // TODO answer this question: does it make any difference?

  def fixture() = new ListBuffer[Int]

  def populate(list: ListBuffer[Int]): Unit = {
    list += 33
    list += 77
    list += 44
    list += 77
    list += 55
    list += 77
    list += 66
  }
}
