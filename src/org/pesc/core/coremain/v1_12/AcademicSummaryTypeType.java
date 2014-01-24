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
 * <p>Java class for AcademicSummaryTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcademicSummaryTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="SenderOnly"/>
 *     &lt;enumeration value="TransferOnly"/>
 *     &lt;enumeration value="AllNotRepeated"/>
 *     &lt;enumeration value="SenderNotRepeated"/>
 *     &lt;enumeration value="TransferNotRepeated"/>
 *     &lt;enumeration value="AcademicRenewal"/>
 *     &lt;enumeration value="CarryoverCredit"/>
 *     &lt;enumeration value="DegreeApplicable"/>
 *     &lt;enumeration value="NonDegreeApplicable"/>
 *     &lt;enumeration value="ConvertedFrom"/>
 *     &lt;enumeration value="ConvertedTo"/>
 *     &lt;enumeration value="Weighted"/>
 *     &lt;enumeration value="NonWeighted"/>
 *     &lt;enumeration value="UserDefined"/>
 *     &lt;enumeration value="Cumulative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcademicSummaryTypeType")
@XmlEnum
public enum AcademicSummaryTypeType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("SenderOnly")
    SENDER_ONLY("SenderOnly"),
    @XmlEnumValue("TransferOnly")
    TRANSFER_ONLY("TransferOnly"),
    @XmlEnumValue("AllNotRepeated")
    ALL_NOT_REPEATED("AllNotRepeated"),
    @XmlEnumValue("SenderNotRepeated")
    SENDER_NOT_REPEATED("SenderNotRepeated"),
    @XmlEnumValue("TransferNotRepeated")
    TRANSFER_NOT_REPEATED("TransferNotRepeated"),
    @XmlEnumValue("AcademicRenewal")
    ACADEMIC_RENEWAL("AcademicRenewal"),
    @XmlEnumValue("CarryoverCredit")
    CARRYOVER_CREDIT("CarryoverCredit"),
    @XmlEnumValue("DegreeApplicable")
    DEGREE_APPLICABLE("DegreeApplicable"),
    @XmlEnumValue("NonDegreeApplicable")
    NON_DEGREE_APPLICABLE("NonDegreeApplicable"),
    @XmlEnumValue("ConvertedFrom")
    CONVERTED_FROM("ConvertedFrom"),
    @XmlEnumValue("ConvertedTo")
    CONVERTED_TO("ConvertedTo"),
    @XmlEnumValue("Weighted")
    WEIGHTED("Weighted"),
    @XmlEnumValue("NonWeighted")
    NON_WEIGHTED("NonWeighted"),
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative");
    private final String value;

    AcademicSummaryTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcademicSummaryTypeType fromValue(String v) {
        for (AcademicSummaryTypeType c: AcademicSummaryTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
