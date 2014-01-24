//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDiscountRequestCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeDiscountRequestCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FirstTranscriptRequested"/>
 *     &lt;enumeration value="PrepaidFee"/>
 *     &lt;enumeration value="FinancialHardship"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeeDiscountRequestCodeType")
@XmlEnum
public enum FeeDiscountRequestCodeType {

    @XmlEnumValue("FirstTranscriptRequested")
    FIRST_TRANSCRIPT_REQUESTED("FirstTranscriptRequested"),
    @XmlEnumValue("PrepaidFee")
    PREPAID_FEE("PrepaidFee"),
    @XmlEnumValue("FinancialHardship")
    FINANCIAL_HARDSHIP("FinancialHardship");
    private final String value;

    FeeDiscountRequestCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeDiscountRequestCodeType fromValue(String v) {
        for (FeeDiscountRequestCodeType c: FeeDiscountRequestCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
