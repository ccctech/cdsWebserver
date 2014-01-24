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
 * <p>Java class for ContactPreferenceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactPreferenceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="InstantMessage"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="PostalMail"/>
 *     &lt;enumeration value="TextMessage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactPreferenceCodeType")
@XmlEnum
public enum ContactPreferenceCodeType {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("InstantMessage")
    INSTANT_MESSAGE("InstantMessage"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("PostalMail")
    POSTAL_MAIL("PostalMail"),
    @XmlEnumValue("TextMessage")
    TEXT_MESSAGE("TextMessage");
    private final String value;

    ContactPreferenceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactPreferenceCodeType fromValue(String v) {
        for (ContactPreferenceCodeType c: ContactPreferenceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
