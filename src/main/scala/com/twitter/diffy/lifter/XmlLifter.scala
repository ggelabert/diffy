package com.twitter.diffy.lifter

import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper
import com.twitter.util.NoStacktrace
import net.liftweb.json._

import scala.language.postfixOps
import scala.xml._

object XmlLifter {
  object XmlNull
  object XmlParseError extends Exception with NoStacktrace

  val Mapper = new ObjectMapper with ScalaObjectMapper

  def lift(node: JsonNode): Any = {
    JsonLifter.lift(node)
  }

  def decode(xml: String): JsonNode = {
    Mapper.readTree(prettyRender(Xml.toJson(XML.loadString(xml))))
  }
  def encode(item: Any): String = Mapper.writer.writeValueAsString(item)
}
