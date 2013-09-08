package com.michelcasanova.scala.regex

import java.nio.charset.Charset

import java.nio.charset.StandardCharsets
import scala.io.Source
import java.io.File
import scala.annotation.tailrec



object Regex {

  val TEMP_FILE_NAME = "temp.tmp";
  val DEFAULT_ENCODING = StandardCharsets.UTF_8;

  def apply(file: String, regex: String, replacement: String): Unit = {

    val f = new File(file);
    val conversions = List[Conversion](new Conversion("", ""))
    println("apply 1")

    apply(file, conversions)

  }

  def apply(file: String, c: List[Conversion]) {

    apply(file, c, DEFAULT_ENCODING)

  }

  def apply(file: String, conversions: List[Conversion], encoding: Charset) {

    applyRegex(new File(file), conversions, encoding)

  }

  //@tailrec
  private def applyRegex(file: File, regexL: List[Conversion], encoding: Charset) {

    println("inside applyRegex")
    if (file.isDirectory()) {

      file.listFiles().foreach(f => applyRegex(f, regexL, encoding))
    } else {

      applyRegexTofile()
    }

    def applyRegexTofile() = {

      regexL.foreach(regex => {

      })

      println(file.getName())
    }

  }

  def main(args: Array[String]) {

    apply("C:\\dunsregistered\\data\\[dbo].[company_business_type].Table.sql", "[tT][rR][uU][eE]", "true")
  }

}