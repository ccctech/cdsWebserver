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
 * <p>Java class for SchoolOverrideCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SchoolOverrideCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Institutional"/>
 *     &lt;enumeration value="Multicampus"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="StudyAbroad"/>
 *     &lt;enumeration value="Coop"/>
 *     &lt;enumeration value="Reciprocal"/>
 *     &lt;enumeration value="Internship"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchoolOverrideCodeType")
@XmlEnum
public enum SchoolOverrideCodeType {

    @XmlEnumValue("Institutional")
    INSTITUTIONAL("Institutional"),
    @XmlEnumValue("Multicampus")
    MULTICAMPUS("Multicampus"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("StudyAbroad")
    STUDY_ABROAD("StudyAbroad"),
    @XmlEnumValue("Coop")
    COOP("Coop"),
    @XmlEnumValue("Reciprocal")
    RECIPROCAL("Reciprocal"),
    @XmlEnumValue("Internship")
    INTERNSHIP("Internship");
    private final String value;

    SchoolOverrideCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchoolOverrideCodeType fromValue(String v) {
        for (SchoolOverrideCodeType c: SchoolOverrideCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
