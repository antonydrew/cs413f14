//package edu.luc.cs.cs372.echo
package impl

class ParseInput extends main.Parse {

  val entry = Seq(scala.io.Source.stdin.getLines())
  def echo(msg: String) = entry
}
