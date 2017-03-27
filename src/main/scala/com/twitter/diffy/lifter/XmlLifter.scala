package com.twitter.diffy.lifter

import com.twitter.util.NoStacktrace

import scala.language.postfixOps
import scala.xml._

object XmlLifter {
  object XmlNull
  object XmlParseError extends Exception with NoStacktrace

  def lift(node: Node): FieldMap[Any] = {
    node match {
      case Node(label, attribs, Text(text)) => {
        FieldMap(Map(node.label -> text))
      }
      case _ => {
        FieldMap(Map(node.label ->  (FieldMap(node.attributes.asAttrMap) ++ node.child.map(subNode => lift(subNode)))))
      }
    }
  }

  def lift(node: Elem): FieldMap[Any] = {
    node match {
      case Elem(prefix, label, attribs, scope, Text(text)) => {
        FieldMap(Map(node.label -> text))
      }
      case _ => {
        FieldMap(Map(node.label -> node.child.map(subNode => lift(subNode))))
      }
    }
  }

  def decode(xml: String): Elem = {
    XML.loadString(xml.split('\n').map(_.trim.filter(_ >= ' ')).mkString)
  }
  def encode(item: Any): String = XML.toString
}
