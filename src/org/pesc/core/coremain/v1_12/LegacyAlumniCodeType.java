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
 * <p>Java class for LegacyAlumniCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegacyAlumniCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Father"/>
 *     &lt;enumeration value="Mother"/>
 *     &lt;enumeration value="Sibling"/>
 *     &lt;enumeration value="Spouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegacyAlumniCodeType")
@XmlEnum
public enum LegacyAlumniCodeType {

    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("Sibling")
    SIBLING("Sibling"),
    @XmlEnumValue("Spouse")
    SPOUSE("Spouse");
    private final String value;

    LegacyAlumniCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegacyAlumniCodeType fromValue(String v) {
        for (LegacyAlumniCodeType c: LegacyAlumniCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
