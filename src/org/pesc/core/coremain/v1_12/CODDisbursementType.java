//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODDisbursementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODDisbursementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementType">
 *       &lt;sequence>
 *         &lt;element name="DisbursementReleaseIndicator" type="{urn:org:pesc:core:CoreMain:v1.12.0}DisbursementReleaseIndicatorType" minOccurs="0"/>
 *         &lt;element name="DisbursementSequenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODDisbursementType", propOrder = {
    "disbursementReleaseIndicator",
    "disbursementSequenceNumber",
    "noteMessage"
})
@XmlSeeAlso({
    PellDisbursementType.class,
    org.pesc.core.coremain.v1_12.AcademicCompetitivenessGrantType.Disbursement.class,
    AlternativeLoanDisbursementType.class,
    DLDisbursementType.class,
    org.pesc.core.coremain.v1_12.NationalSMARTGrantType.Disbursement.class
})
public class CODDisbursementType
    extends DisbursementType
{

    @XmlElementRef(name = "DisbursementReleaseIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> disbursementReleaseIndicator;
    @XmlElementRef(name = "DisbursementSequenceNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> disbursementSequenceNumber;
    @XmlElement(name = "NoteMessage")
    protected String noteMessage;

    /**
     * Gets the value of the disbursementReleaseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDisbursementReleaseIndicator() {
        return disbursementReleaseIndicator;
    }

    /**
     * Sets the value of the disbursementReleaseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDisbursementReleaseIndicator(JAXBElement<Boolean> value) {
        this.disbursementReleaseIndicator = value;
    }

    /**
     * Gets the value of the disbursementSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDisbursementSequenceNumber() {
        return disbursementSequenceNumber;
    }

    /**
     * Sets the value of the disbursementSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDisbursementSequenceNumber(JAXBElement<Integer> value) {
        this.disbursementSequenceNumber = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * Sets the value of the noteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteMessage(String value) {
        this.noteMessage = value;
    }

}
