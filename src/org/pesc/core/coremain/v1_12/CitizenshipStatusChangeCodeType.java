//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitizenshipStatusChangeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CitizenshipStatusChangeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Naturalized"/>
 *     &lt;enumeration value="ResidentAlien"/>
 *     &lt;enumeration value="EligibleNonCitizen"/>
 *     &lt;enumeration value="DualCitizen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CitizenshipStatusChangeCodeType")
@XmlEnum
public enum CitizenshipStatusChangeCodeType {

    @XmlEnumValue("Naturalized")
    NATURALIZED("Naturalized"),
    @XmlEnumValue("ResidentAlien")
    RESIDENT_ALIEN("ResidentAlien"),
    @XmlEnumValue("EligibleNonCitizen")
    ELIGIBLE_NON_CITIZEN("EligibleNonCitizen"),
    @XmlEnumValue("DualCitizen")
    DUAL_CITIZEN("DualCitizen");
    private final String value;

    CitizenshipStatusChangeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CitizenshipStatusChangeCodeType fromValue(String v) {
        for (CitizenshipStatusChangeCodeType c: CitizenshipStatusChangeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
