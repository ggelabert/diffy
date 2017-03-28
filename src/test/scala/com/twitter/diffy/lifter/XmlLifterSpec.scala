package com.twitter.diffy.lifter

import com.twitter.diffy.ParentSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.collection.immutable.{List, Nil}

@RunWith(classOf[JUnitRunner])
class XmlLifterSpec extends ParentSpec {
  val XML = """<?xml version="1.0" encoding="UTF-8"?>
              <PurchaseDetailRS xmlns="http://www.hotelbeds.com/schemas/2005/06/messages" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.hotelbeds.com/schemas/2005/06/messages PurchaseDetailRS.xsd">
                  <AuditData>
                      <ProcessTime>169</ProcessTime>
                      <Timestamp>2017-03-27 15:03:38.569</Timestamp>
                      <RequestHost>10.162.2.146</RequestHost>
                      <ServerName>LIVE</ServerName>
                      <ServerId>02</ServerId>
                      <SchemaRelease>2005/06</SchemaRelease>
                      <HydraCoreRelease>3.22.3.20170312</HydraCoreRelease>
                      <HydraEnumerationsRelease>3#kdEJjPovQWqBfYhQ18gmzw</HydraEnumerationsRelease>
                      <MerlinRelease>46#0</MerlinRelease>
                  </AuditData>
                  <Purchase purchaseToken="63362257876" timeToExpiration="1799925">
                      <Reference>
                          <FileNumber>7356587</FileNumber>
                          <IncomingOffice code="102"/>
                      </Reference>
                      <Status>CANCELLED</Status>
                      <Agency>
                          <Code>30543</Code>
                          <Branch>1</Branch>
                      </Agency>
                      <Language>CAS</Language>
                      <CreationDate date="20170105" time="1221"/>
                      <CreationUser>PBOLTEST</CreationUser>
                      <CancellationFeesDate date="20170222" time="0000" dateUTC="20170220 0000"/>
                      <AutoCancellationDate days="1" date="20170221" time="0000" dateUTC="20170221 0000"/>
                      <PaymentStatus>T</PaymentStatus>
                      <Holder type="AD">
                          <Age>0</Age>
                          <Name>TEST</Name>
                          <LastName>TEST</LastName>
                      </Holder>
                      <AgencyReference>TAB</AgencyReference>
                      <ServiceList>
                          <Service xsi:type="ServiceTicket" SPUI="102#O#1">
                              <Reference>
                                  <FileNumber>7356587-OE1</FileNumber>
                                  <IncomingOffice code="102"/>
                              </Reference>
                              <Status>CANCELLED</Status>
                              <ContractList>
                                  <Contract>
                                      <Name>BCN SAG FAM16</Name>
                                      <Code>0</Code>
                                      <IncomingOffice code="102"/>
                                  </Contract>
                              </ContractList>
                              <Supplier name="HOTELBEDS SPAIN, S.L.U." vatNumber="ESB28916765"/>
                              <DateFrom date="20170224"/>
                              <DateTo date="20170224"/>
                              <Days>0</Days>
                              <Currency code="EUR">Euro</Currency>
                              <TotalAmount>0.000</TotalAmount>
                              <NetPrice>0.00</NetPrice>
                              <AdditionalCostList>
                                  <AdditionalCost type="AG_COMMISSION">
                                      <Price>
                                          <Amount>0.000</Amount>
                                      </Price>
                                  </AdditionalCost>
                                  <AdditionalCost type="COMMISSION_VAT">
                                      <Price>
                                          <Amount>0.000</Amount>
                                      </Price>
                                  </AdditionalCost>
                                  <AdditionalCost type="COMMISSION_PCT">
                                      <Price>
                                          <Amount>11.000</Amount>
                                      </Price>
                                  </AdditionalCost>
                              </AdditionalCostList>
                              <PhoneList>
                                  <ContactNumber type="destination">+34971211630</ContactNumber>
                              </PhoneList>
                              <TicketInfo xsi:type="ProductTicket">
                                  <Code>SAGRFAMILI</Code>
                                  <Name>Sagrada Familia Tour — Acceso rápido</Name>
                                  <CompanyCode>E10</CompanyCode>
                                  <TicketClass>T</TicketClass>
                                  <Classification code="SIGHT">Lugares de interes y visitas</Classification>
                              </TicketInfo>
                              <ValuationRequired>false</ValuationRequired>
                              <AvailableModality code="1000ESPANO@STANDARD||">
                                  <Name>En español a las 10.00 horas</Name>
                                  <Contract>
                                      <Name>BCN SAG FAM16</Name>
                                      <Code>0</Code>
                                      <IncomingOffice code="102"/>
                                  </Contract>
                                  <PriceList>
                                      <Price>
                                          <Amount>0.000</Amount>
                                          <Description>Adults Price</Description>
                                      </Price>
                                      <Price>
                                          <Amount>0.000</Amount>
                                          <Description>Babies Price</Description>
                                      </Price>
                                      <Price>
                                          <Amount>0.000</Amount>
                                          <Description>Children Price</Description>
                                      </Price>
                                      <Price>
                                          <Amount>0.000</Amount>
                                          <Description>Total Price</Description>
                                      </Price>
                                      <Price>
                                          <Amount>0.000</Amount>
                                          <Description>Ticket Office Price</Description>
                                      </Price>
                                      <Price>
                                          <Amount>0.000</Amount>
                                          <Description>Child Ticket Office Price</Description>
                                      </Price>
                                      <Price paxCount="0">
                                          <Amount>0</Amount>
                                          <Description>Real Adult Number</Description>
                                      </Price>
                                      <Price paxCount="0">
                                          <Amount>0</Amount>
                                          <Description>Real Child Number</Description>
                                      </Price>
                                  </PriceList>
                                  <PriceRangeList>
                                      <PriceRange type="AD" unitPrice="68.000"/>
                                      <PriceRange type="CH" ageFrom="4" ageTo="10" unitPrice="18.000"/>
                                  </PriceRangeList>
                                  <VoucherType>M</VoucherType>
                              </AvailableModality>
                              <Paxes>
                                  <AdultCount>2</AdultCount>
                                  <ChildCount>1</ChildCount>
                              </Paxes>
                              <ServiceDetailList>
                                  <ServiceDetail code="PHONENUMBER">
                                      <Name>Por favor, indique el nº de móvil de contacto en caso de emergencia (incluyendo código internacional )</Name>
                                      <Description>458745896</Description>
                                  </ServiceDetail>
                              </ServiceDetailList>
                              <NewServiceDescription>Sagrada Familia Tour — Acceso rápido</NewServiceDescription>
                          </Service>
                      </ServiceList>
                      <Currency code="EUR"/>
                      <PaymentData>
                          <PaymentType code="P"/>
                          <InvoiceCompany>
                              <Code>HBD</Code>
                              <Name>BEDS ON LINE, S.L.U.</Name>
                              <RegistrationNumber>ESB28931681</RegistrationNumber>
                          </InvoiceCompany>
                          <Description>*55* Beds On Line, Banco: CITIBANK(Avenida de Europa, 19 - P.E. la Moraleja, 108 - Alcobendas, Madrid) Cuenta:ES35 1474 0000 10 0012272006,  SWIFT:CITIESMX,  7 días antes de la llegada de los clientes (excepto reservas de grupos. Días de antelación fijados en el momento de la confirmación). En la orden de pago rogamos indiquen nuestro número de referencia.    Gracias por su colaboración., AVISO: CAMBIO CÓDIGO SWIFT</Description>
                      </PaymentData>
                      <PurchaseExtraInfoList>
                          <ExtendedData type="EXT_ADDITIONAL_INFO">
                              <Name>INFO_TTOO_PENDING_AMOUNT</Name>
                              <Value>0.000</Value>
                          </ExtendedData>
                      </PurchaseExtraInfoList>
                      <TotalPrice>0.000</TotalPrice>
                      <NetPrice>0.000</NetPrice>
                      <TotalPaid>0.000</TotalPaid>
                      <PendingAmount>0.000</PendingAmount>
                      <BookingInformation>
                          <webUser>PBOLTEST</webUser>
                          <webId>1126</webId>
                          <webDomain>bedsonline</webDomain>
                          <appName>evolution</appName>
                          <ipClient>212.170.239.110</ipClient>
                          <server>50</server>
                          <codUsr>16783</codUsr>
                      </BookingInformation>
                      <CommissionType retailer="N">O</CommissionType>
                      <PhoneList>
                          <ContactNumber type="source">+34971211630</ContactNumber>
                      </PhoneList>
                      <IndPvp>N</IndPvp>
                  </Purchase>
              </PurchaseDetailRS>
              """
  describe("XmlLifter"){
    it("should correctly lift all the childs of the root element") {
      XmlLifter.lift(XmlLifter.decode(XML)) mustBe a [FieldMap[_]]
    }
  }
}
