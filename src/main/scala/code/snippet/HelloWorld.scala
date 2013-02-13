package code
package snippet

import lib._

import net.liftweb._
import util.Helpers._
import common._
import java.util.Date

class HelloWorld {
  lazy val date: Box[Date] = DependencyFactory.inject[Date] // inject the date

  def render = "* *" #> date.map(_.toString)


  /*
   lazy val date: Date = DependencyFactory.time.vend // create the date via factory

   def howdy = "#time *" #> date.toString
   */
}

