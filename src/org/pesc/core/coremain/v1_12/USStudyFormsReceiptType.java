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
 * <p>Java class for USStudyFormsReceiptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USStudyFormsReceiptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I20"/>
 *     &lt;enumeration value="IAP66"/>
 *     &lt;enumeration value="I94"/>
 *     &lt;enumeration value="EducationalCosts"/>
 *     &lt;enumeration value="I134"/>
 *     &lt;enumeration value="I688B"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="I551"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USStudyFormsReceiptType")
@XmlEnum
public enum USStudyFormsReceiptType {

    @XmlEnumValue("I20")
    I_20("I20"),
    @XmlEnumValue("IAP66")
    IAP_66("IAP66"),
    @XmlEnumValue("I94")
    I_94("I94"),
    @XmlEnumValue("EducationalCosts")
    EDUCATIONAL_COSTS("EducationalCosts"),
    @XmlEnumValue("I134")
    I_134("I134"),
    @XmlEnumValue("I688B")
    I_688_B("I688B"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("I551")
    I_551("I551"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    USStudyFormsReceiptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static USStudyFormsReceiptType fromValue(String v) {
        for (USStudyFormsReceiptType c: USStudyFormsReceiptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
