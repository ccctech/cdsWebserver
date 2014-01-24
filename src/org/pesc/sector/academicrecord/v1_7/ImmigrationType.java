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
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_12.NonImmigrantVisaStatusChangeCodeType;
import org.pesc.core.coremain.v1_12.USStudyFormsReceiptType;


/**
 * <p>Java class for ImmigrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmigrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlienRegisrationNumber" type="{urn:org:pesc:core:CoreMain:v1.12.0}AlienRegistrationNumberType" minOccurs="0"/>
 *         &lt;element name="FirstEntryIntoUSDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}FirstEntryIntoUSDateType" minOccurs="0"/>
 *         &lt;element name="ImmigrationI20RequestIndicator" type="{urn:org:pesc:core:CoreMain:v1.12.0}ImmigrationI20RequestIndicatorType" minOccurs="0"/>
 *         &lt;element name="NonImmigrantVisaIssueDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}NonImmigrationVisaIssueDateType" minOccurs="0"/>
 *         &lt;element name="NonImmigrantVisaNumber" type="{urn:org:pesc:core:CoreMain:v1.12.0}NonImmigrantVisaNumberType" minOccurs="0"/>
 *         &lt;element name="NonImmigrantVisaStatusChangeCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}NonImmigrantVisaStatusChangeCodeType" minOccurs="0"/>
 *         &lt;element name="NonImmigrantVisaStatusChangeDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}NonImmigrantVisaStatusChangeDateType" minOccurs="0"/>
 *         &lt;element name="NonImmigrantVisaType" type="{urn:org:pesc:core:CoreMain:v1.12.0}NonImmigrantVisaType" minOccurs="0"/>
 *         &lt;element name="RequiredFormsReceiveDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}RequiredFormsReceiveDateType" minOccurs="0"/>
 *         &lt;element name="Sponsor" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}SponsorType" minOccurs="0"/>
 *         &lt;element name="USStudyFormsReceipt" type="{urn:org:pesc:core:CoreMain:v1.12.0}USStudyFormsReceiptType" minOccurs="0"/>
 *         &lt;element name="VisaExpirationDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}VisaExpirationDateType" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmigrationType", propOrder = {
    "alienRegisrationNumber",
    "firstEntryIntoUSDate",
    "immigrationI20RequestIndicator",
    "nonImmigrantVisaIssueDate",
    "nonImmigrantVisaNumber",
    "nonImmigrantVisaStatusChangeCode",
    "nonImmigrantVisaStatusChangeDate",
    "nonImmigrantVisaType",
    "requiredFormsReceiveDate",
    "sponsor",
    "usStudyFormsReceipt",
    "visaExpirationDate",
    "noteMessage"
})
public class ImmigrationType {

    @XmlElement(name = "AlienRegisrationNumber")
    protected String alienRegisrationNumber;
    @XmlElement(name = "FirstEntryIntoUSDate")
    protected XMLGregorianCalendar firstEntryIntoUSDate;
    @XmlElement(name = "ImmigrationI20RequestIndicator")
    protected Boolean immigrationI20RequestIndicator;
    @XmlElement(name = "NonImmigrantVisaIssueDate")
    protected XMLGregorianCalendar nonImmigrantVisaIssueDate;
    @XmlElement(name = "NonImmigrantVisaNumber")
    protected String nonImmigrantVisaNumber;
    @XmlElement(name = "NonImmigrantVisaStatusChangeCode")
    protected NonImmigrantVisaStatusChangeCodeType nonImmigrantVisaStatusChangeCode;
    @XmlElement(name = "NonImmigrantVisaStatusChangeDate")
    protected XMLGregorianCalendar nonImmigrantVisaStatusChangeDate;
    @XmlElement(name = "NonImmigrantVisaType")
    protected String nonImmigrantVisaType;
    @XmlElement(name = "RequiredFormsReceiveDate")
    protected XMLGregorianCalendar requiredFormsReceiveDate;
    @XmlElement(name = "Sponsor")
    protected SponsorType sponsor;
    @XmlElement(name = "USStudyFormsReceipt")
    protected USStudyFormsReceiptType usStudyFormsReceipt;
    @XmlElement(name = "VisaExpirationDate")
    protected XMLGregorianCalendar visaExpirationDate;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the alienRegisrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlienRegisrationNumber() {
        return alienRegisrationNumber;
    }

    /**
     * Sets the value of the alienRegisrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlienRegisrationNumber(String value) {
        this.alienRegisrationNumber = value;
    }

    /**
     * Gets the value of the firstEntryIntoUSDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstEntryIntoUSDate() {
        return firstEntryIntoUSDate;
    }

    /**
     * Sets the value of the firstEntryIntoUSDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstEntryIntoUSDate(XMLGregorianCalendar value) {
        this.firstEntryIntoUSDate = value;
    }

    /**
     * Gets the value of the immigrationI20RequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmigrationI20RequestIndicator() {
        return immigrationI20RequestIndicator;
    }

    /**
     * Sets the value of the immigrationI20RequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmigrationI20RequestIndicator(Boolean value) {
        this.immigrationI20RequestIndicator = value;
    }

    /**
     * Gets the value of the nonImmigrantVisaIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNonImmigrantVisaIssueDate() {
        return nonImmigrantVisaIssueDate;
    }

    /**
     * Sets the value of the nonImmigrantVisaIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNonImmigrantVisaIssueDate(XMLGregorianCalendar value) {
        this.nonImmigrantVisaIssueDate = value;
    }

    /**
     * Gets the value of the nonImmigrantVisaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonImmigrantVisaNumber() {
        return nonImmigrantVisaNumber;
    }

    /**
     * Sets the value of the nonImmigrantVisaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonImmigrantVisaNumber(String value) {
        this.nonImmigrantVisaNumber = value;
    }

    /**
     * Gets the value of the nonImmigrantVisaStatusChangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NonImmigrantVisaStatusChangeCodeType }
     *     
     */
    public NonImmigrantVisaStatusChangeCodeType getNonImmigrantVisaStatusChangeCode() {
        return nonImmigrantVisaStatusChangeCode;
    }

    /**
     * Sets the value of the nonImmigrantVisaStatusChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonImmigrantVisaStatusChangeCodeType }
     *     
     */
    public void setNonImmigrantVisaStatusChangeCode(NonImmigrantVisaStatusChangeCodeType value) {
        this.nonImmigrantVisaStatusChangeCode = value;
    }

    /**
     * Gets the value of the nonImmigrantVisaStatusChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNonImmigrantVisaStatusChangeDate() {
        return nonImmigrantVisaStatusChangeDate;
    }

    /**
     * Sets the value of the nonImmigrantVisaStatusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNonImmigrantVisaStatusChangeDate(XMLGregorianCalendar value) {
        this.nonImmigrantVisaStatusChangeDate = value;
    }

    /**
     * Gets the value of the nonImmigrantVisaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonImmigrantVisaType() {
        return nonImmigrantVisaType;
    }

    /**
     * Sets the value of the nonImmigrantVisaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonImmigrantVisaType(String value) {
        this.nonImmigrantVisaType = value;
    }

    /**
     * Gets the value of the requiredFormsReceiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequiredFormsReceiveDate() {
        return requiredFormsReceiveDate;
    }

    /**
     * Sets the value of the requiredFormsReceiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequiredFormsReceiveDate(XMLGregorianCalendar value) {
        this.requiredFormsReceiveDate = value;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link SponsorType }
     *     
     */
    public SponsorType getSponsor() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SponsorType }
     *     
     */
    public void setSponsor(SponsorType value) {
        this.sponsor = value;
    }

    /**
     * Gets the value of the usStudyFormsReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link USStudyFormsReceiptType }
     *     
     */
    public USStudyFormsReceiptType getUSStudyFormsReceipt() {
        return usStudyFormsReceipt;
    }

    /**
     * Sets the value of the usStudyFormsReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link USStudyFormsReceiptType }
     *     
     */
    public void setUSStudyFormsReceipt(USStudyFormsReceiptType value) {
        this.usStudyFormsReceipt = value;
    }

    /**
     * Gets the value of the visaExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisaExpirationDate() {
        return visaExpirationDate;
    }

    /**
     * Sets the value of the visaExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisaExpirationDate(XMLGregorianCalendar value) {
        this.visaExpirationDate = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteMessage() {
        if (noteMessage == null) {
            noteMessage = new ArrayList<String>();
        }
        return this.noteMessage;
    }

}
