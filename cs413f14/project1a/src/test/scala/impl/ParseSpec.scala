package edu.luc.cs.cs372.echo.impl

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
 * Property-based testing using ScalaCheck directly.
 *
 * [[http://www.scalacheck.org ScalaCheck documentation]]
 */
object ParseSpec extends Properties("Parse") {



  val doubleEcho = new ParseInput



  property("doubleEcho") = forAll { (a: String) =>
    doubleEcho.echo(a) == a + " " + a
  }

}