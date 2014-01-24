//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_12.AnswerSelectedCodeType;


/**
 * List of possible choices to a survey question
 * 
 * <p>Java class for AllowedAnswersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowedAnswersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowedAnswerText" type="{urn:org:pesc:core:CoreMain:v1.12.0}AllowedAnswerTextType"/>
 *         &lt;element name="AnswerSelectedCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}AnswerSelectedCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowedAnswersType", propOrder = {
    "allowedAnswerText",
    "answerSelectedCode"
})
public class AllowedAnswersType {

    @XmlElement(name = "AllowedAnswerText", required = true)
    protected String allowedAnswerText;
    @XmlElement(name = "AnswerSelectedCode")
    protected AnswerSelectedCodeType answerSelectedCode;

    /**
     * Gets the value of the allowedAnswerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedAnswerText() {
        return allowedAnswerText;
    }

    /**
     * Sets the value of the allowedAnswerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedAnswerText(String value) {
        this.allowedAnswerText = value;
    }

    /**
     * Gets the value of the answerSelectedCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerSelectedCodeType }
     *     
     */
    public AnswerSelectedCodeType getAnswerSelectedCode() {
        return answerSelectedCode;
    }

    /**
     * Sets the value of the answerSelectedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerSelectedCodeType }
     *     
     */
    public void setAnswerSelectedCode(AnswerSelectedCodeType value) {
        this.answerSelectedCode = value;
    }

}
