package cs2.hello

import io.StdIn._

object HelloWorld {
  def main(args:Array[String]):Unit = {
    println("Hello world!")
    val name = readLine("Enter your name: ")
    println("Hello, " + name + "!")
  }

class Contact(var name:String, private val num:Long, private var eml:String) {
    val username = eml.split("@")(0)
    def phoneNumber = num
    def email = eml
    def printOut() { println(name + "\t" + num + "\t" + eml) }
}
val c1 = new Contact ("Holmes, Sherlock", 2109995555, "sholmes@221b.co.uk")



}





