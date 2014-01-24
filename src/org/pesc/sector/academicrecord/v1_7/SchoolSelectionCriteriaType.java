//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_12.StudentActivityCodeType;


/**
 * The characteristics of an educational institution that are important for selection
 * 
 * <p>Java class for SchoolSelectionCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolSelectionCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolCharacteristics" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}SchoolCharacteristicsType" minOccurs="0"/>
 *         &lt;element name="SchoolSupportServices" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}SchoolSupportServicesType" minOccurs="0"/>
 *         &lt;element name="FinancialAidNeeds" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}FinancialAidNeedsType" minOccurs="0"/>
 *         &lt;element name="StudentActivityCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}StudentActivityCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherSelectionCharacteristics" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}CharacteristicsSelectionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolSelectionCriteriaType", propOrder = {
    "schoolCharacteristics",
    "schoolSupportServices",
    "financialAidNeeds",
    "studentActivityCode",
    "otherSelectionCharacteristics"
})
public class SchoolSelectionCriteriaType {

    @XmlElement(name = "SchoolCharacteristics")
    protected SchoolCharacteristicsType schoolCharacteristics;
    @XmlElement(name = "SchoolSupportServices")
    protected SchoolSupportServicesType schoolSupportServices;
    @XmlElement(name = "FinancialAidNeeds")
    protected FinancialAidNeedsType financialAidNeeds;
    @XmlElement(name = "StudentActivityCode")
    protected List<StudentActivityCodeType> studentActivityCode;
    @XmlElement(name = "OtherSelectionCharacteristics")
    protected List<CharacteristicsSelectionsType> otherSelectionCharacteristics;

    /**
     * Gets the value of the schoolCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCharacteristicsType }
     *     
     */
    public SchoolCharacteristicsType getSchoolCharacteristics() {
        return schoolCharacteristics;
    }

    /**
     * Sets the value of the schoolCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCharacteristicsType }
     *     
     */
    public void setSchoolCharacteristics(SchoolCharacteristicsType value) {
        this.schoolCharacteristics = value;
    }

    /**
     * Gets the value of the schoolSupportServices property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolSupportServicesType }
     *     
     */
    public SchoolSupportServicesType getSchoolSupportServices() {
        return schoolSupportServices;
    }

    /**
     * Sets the value of the schoolSupportServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolSupportServicesType }
     *     
     */
    public void setSchoolSupportServices(SchoolSupportServicesType value) {
        this.schoolSupportServices = value;
    }

    /**
     * Gets the value of the financialAidNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAidNeedsType }
     *     
     */
    public FinancialAidNeedsType getFinancialAidNeeds() {
        return financialAidNeeds;
    }

    /**
     * Sets the value of the financialAidNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAidNeedsType }
     *     
     */
    public void setFinancialAidNeeds(FinancialAidNeedsType value) {
        this.financialAidNeeds = value;
    }

    /**
     * Gets the value of the studentActivityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentActivityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentActivityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentActivityCodeType }
     * 
     * 
     */
    public List<StudentActivityCodeType> getStudentActivityCode() {
        if (studentActivityCode == null) {
            studentActivityCode = new ArrayList<StudentActivityCodeType>();
        }
        return this.studentActivityCode;
    }

    /**
     * Gets the value of the otherSelectionCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSelectionCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSelectionCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicsSelectionsType }
     * 
     * 
     */
    public List<CharacteristicsSelectionsType> getOtherSelectionCharacteristics() {
        if (otherSelectionCharacteristics == null) {
            otherSelectionCharacteristics = new ArrayList<CharacteristicsSelectionsType>();
        }
        return this.otherSelectionCharacteristics;
    }

}
