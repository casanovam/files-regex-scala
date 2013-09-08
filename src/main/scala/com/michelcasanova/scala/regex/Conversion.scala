package com.michelcasanova.scala.regex

class Conversion(r: String, c: String) {

  var pattern = r
  val replace = c
  
  def getRegex() : String = pattern
  def getConversion() : String = replace
}