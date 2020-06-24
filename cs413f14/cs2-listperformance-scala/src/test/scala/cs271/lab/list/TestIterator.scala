package cs271.lab.list

import org.scalatest.FunSuite

class TestIterator extends FunSuite {

  test("testEmptyList"){
    val list = Fixture.fixture()
    val iterator = list.iterator
    assert(! iterator.hasNext)
  }

  test("testNonEmptyList"){
    val list = Fixture.fixture()
    Fixture.populate(list)
    val i = list.iterator

    assert(i.hasNext)
    assert(i.next === 33)
    // TODO fix the expected values in the assertions below
    assert(i.hasNext)
    assert(i.next === 10)
    assert(i.hasNext)
    assert(i.next === 100)
    assert(i.hasNext)
    assert(i.next === 1000)
    assert(i.hasNext)
    assert(i.next === 10000)
    assert(i.hasNext)
  }

  test("testAverageValue") {
    val list = Fixture.fixture()
    Fixture.populate(list)

    var sum: Int = 0

    var mean: Int = 0
    // TODO use for loop comprehension over the list to compute the average (mean) of the values
    // (defined as the sum of the items divided by the number of items)

    for (i <- list) mean = (list(i)+sum)/i

  }
}