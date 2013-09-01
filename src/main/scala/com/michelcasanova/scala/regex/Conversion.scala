package com.michelcasanova.scala.regex

class Conversion(r: String, c: String) {

  var regex = r
  val conversion = c
  
  def getRegex() : String = regex
  def getConversion() : String = conversion
}