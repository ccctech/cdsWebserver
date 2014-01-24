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
 * <p>Java class for QuestionFormatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionFormatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CheckBox"/>
 *     &lt;enumeration value="DropDownMenu"/>
 *     &lt;enumeration value="NoInput"/>
 *     &lt;enumeration value="OneLineText"/>
 *     &lt;enumeration value="RadioButton"/>
 *     &lt;enumeration value="TextArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuestionFormatCodeType")
@XmlEnum
public enum QuestionFormatCodeType {

    @XmlEnumValue("CheckBox")
    CHECK_BOX("CheckBox"),
    @XmlEnumValue("DropDownMenu")
    DROP_DOWN_MENU("DropDownMenu"),
    @XmlEnumValue("NoInput")
    NO_INPUT("NoInput"),
    @XmlEnumValue("OneLineText")
    ONE_LINE_TEXT("OneLineText"),
    @XmlEnumValue("RadioButton")
    RADIO_BUTTON("RadioButton"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea");
    private final String value;

    QuestionFormatCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionFormatCodeType fromValue(String v) {
        for (QuestionFormatCodeType c: QuestionFormatCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
