package com.twitter.diffy.lifter

import com.twitter.diffy.ParentSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class XmlLifterSpec extends ParentSpec {
  val XML = """<PurchaseDetailRQ xmlns="http://www.hotelbeds.com/schemas/2005/06/messages" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.hotelbeds.com/schemas/2005/06/messages PurchaseDetailRS.xsd" version="EVOLUTION">
                  <Language>CAS</Language>
                  <Credentials>
                      <User>16783</User>
                      <Password>16783</Password>
                  </Credentials>
                  <ExtraParamList>
                      <ExtendedData type="EXT_ADDITIONAL_PARAM">
                          <Name>CALL_ATLAS_PLUS</Name>
                          <Value>Y</Value>
                      </ExtendedData>
                  </ExtraParamList>
                  <PurchaseReference>
                      <FileNumber>7356587</FileNumber>
                      <IncomingOffice code="102"/>
                  </PurchaseReference>
              </PurchaseDetailRQ>"""
  describe("XmlLifter"){
    it("should correctly lift maps when keys are invalid identifier prefixes") {
      XmlLifter.lift(XmlLifter.decode(XML)) mustBe a [Map[_, _]]
    }
    it("should correctly lift all the childs of the root element") {
      val res = XmlLifter.lift(XmlLifter.decode(XML));
      res.get("PurchaseDetailRQ")
    }
  }
}
