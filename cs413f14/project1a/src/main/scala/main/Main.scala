//package edu.luc.cs.cs372.echo
package main

object Main extends App {
  val echos = Seq(new impl.ParseInput)
  val counter = 0
  for (e <- echos) {
    scala.e.flatMap(_.split("\\W+"))
    counter+1
    println((counter))
  }


}
