//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FFELDisbursementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FFELDisbursementResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.12.0}FFELDisbursementType">
 *       &lt;sequence>
 *         &lt;element name="Response" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:org:pesc:core:CoreMain:v1.12.0}ResponseType">
 *                 &lt;sequence>
 *                   &lt;element name="DisbursementNetAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}SmallCurrencyType" minOccurs="0"/>
 *                   &lt;element name="DisbursementStatusCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementStatusCodeType" minOccurs="0"/>
 *                   &lt;element name="DisbursementFeeAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}SmallCurrencyType" minOccurs="0"/>
 *                   &lt;element name="DisbursementFeePaid" type="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementFeePaidType" minOccurs="0"/>
 *                   &lt;element name="GuaranteeFeeAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}GuaranteeFeeAmountType" minOccurs="0"/>
 *                   &lt;element name="GuaranteeFeePaid" type="{urn:org:pesc:core:CoreMain:v1.12.0}GuaranteeFeePaidType" minOccurs="0"/>
 *                   &lt;element name="DisbursementReleaseIndicator" type="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementReleaseIndicatorType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FFELDisbursementResponseType", propOrder = {
    "response"
})
public class FFELDisbursementResponseType
    extends FFELDisbursementType
{

    @XmlElement(name = "Response")
    protected FFELDisbursementResponseType.Response response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link FFELDisbursementResponseType.Response }
     *     
     */
    public FFELDisbursementResponseType.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link FFELDisbursementResponseType.Response }
     *     
     */
    public void setResponse(FFELDisbursementResponseType.Response value) {
        this.response = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.12.0}ResponseType">
     *       &lt;sequence>
     *         &lt;element name="DisbursementNetAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}SmallCurrencyType" minOccurs="0"/>
     *         &lt;element name="DisbursementStatusCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementStatusCodeType" minOccurs="0"/>
     *         &lt;element name="DisbursementFeeAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}SmallCurrencyType" minOccurs="0"/>
     *         &lt;element name="DisbursementFeePaid" type="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementFeePaidType" minOccurs="0"/>
     *         &lt;element name="GuaranteeFeeAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}GuaranteeFeeAmountType" minOccurs="0"/>
     *         &lt;element name="GuaranteeFeePaid" type="{urn:org:pesc:core:CoreMain:v1.12.0}GuaranteeFeePaidType" minOccurs="0"/>
     *         &lt;element name="DisbursementReleaseIndicator" type="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementReleaseIndicatorType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "disbursementNetAmount",
        "disbursementStatusCode",
        "disbursementFeeAmount",
        "disbursementFeePaid",
        "guaranteeFeeAmount",
        "guaranteeFeePaid",
        "disbursementReleaseIndicator"
    })
    public static class Response
        extends ResponseType
    {

        @XmlElementRef(name = "DisbursementNetAmount", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> disbursementNetAmount;
        @XmlElement(name = "DisbursementStatusCode")
        protected DisbursementStatusCodeType disbursementStatusCode;
        @XmlElementRef(name = "DisbursementFeeAmount", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> disbursementFeeAmount;
        @XmlElement(name = "DisbursementFeePaid")
        protected BigDecimal disbursementFeePaid;
        @XmlElement(name = "GuaranteeFeeAmount")
        protected BigDecimal guaranteeFeeAmount;
        @XmlElement(name = "GuaranteeFeePaid")
        protected BigDecimal guaranteeFeePaid;
        @XmlElement(name = "DisbursementReleaseIndicator")
        protected Boolean disbursementReleaseIndicator;

        /**
         * Gets the value of the disbursementNetAmount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDisbursementNetAmount() {
            return disbursementNetAmount;
        }

        /**
         * Sets the value of the disbursementNetAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDisbursementNetAmount(JAXBElement<BigDecimal> value) {
            this.disbursementNetAmount = value;
        }

        /**
         * Gets the value of the disbursementStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link DisbursementStatusCodeType }
         *     
         */
        public DisbursementStatusCodeType getDisbursementStatusCode() {
            return disbursementStatusCode;
        }

        /**
         * Sets the value of the disbursementStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link DisbursementStatusCodeType }
         *     
         */
        public void setDisbursementStatusCode(DisbursementStatusCodeType value) {
            this.disbursementStatusCode = value;
        }

        /**
         * Gets the value of the disbursementFeeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDisbursementFeeAmount() {
            return disbursementFeeAmount;
        }

        /**
         * Sets the value of the disbursementFeeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDisbursementFeeAmount(JAXBElement<BigDecimal> value) {
            this.disbursementFeeAmount = value;
        }

        /**
         * Gets the value of the disbursementFeePaid property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDisbursementFeePaid() {
            return disbursementFeePaid;
        }

        /**
         * Sets the value of the disbursementFeePaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDisbursementFeePaid(BigDecimal value) {
            this.disbursementFeePaid = value;
        }

        /**
         * Gets the value of the guaranteeFeeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGuaranteeFeeAmount() {
            return guaranteeFeeAmount;
        }

        /**
         * Sets the value of the guaranteeFeeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGuaranteeFeeAmount(BigDecimal value) {
            this.guaranteeFeeAmount = value;
        }

        /**
         * Gets the value of the guaranteeFeePaid property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGuaranteeFeePaid() {
            return guaranteeFeePaid;
        }

        /**
         * Sets the value of the guaranteeFeePaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGuaranteeFeePaid(BigDecimal value) {
            this.guaranteeFeePaid = value;
        }

        /**
         * Gets the value of the disbursementReleaseIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDisbursementReleaseIndicator() {
            return disbursementReleaseIndicator;
        }

        /**
         * Sets the value of the disbursementReleaseIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDisbursementReleaseIndicator(Boolean value) {
            this.disbursementReleaseIndicator = value;
        }

    }

}
