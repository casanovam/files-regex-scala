package com.michelcasanova.scala.regex

import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import scala.io.Source
import java.io.File

object Regex {

  
  val TEMP_FILE_NAME = "temp.tmp";
  val DEFAULT_ENCODING = StandardCharsets.UTF_8;
  
  def apply(file: String, regex: String, replacement: String) = {
    
    
    
  }
  
  private def apply(file: File, regexL: List[Conversion], encoding: Charset) : Unit = {
    
    
    if(file.isDirectory()){
    
    	file.listFiles().foreach( f => apply(f, regexL, encoding))
    }
    else{
      
      applyRegexTofile()
    }
    
    def applyRegexTofile() = {
      
      println(file.toString())
    }
  }
  
}