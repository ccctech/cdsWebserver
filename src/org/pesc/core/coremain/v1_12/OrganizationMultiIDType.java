//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationMultiIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationMultiIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OPEID" type="{urn:org:pesc:core:CoreMain:v1.12.0}OPEIDType" />
 *       &lt;attribute name="NCHELPID" type="{urn:org:pesc:core:CoreMain:v1.12.0}NCHELPIDType" />
 *       &lt;attribute name="NonEDBranchID" type="{urn:org:pesc:core:CoreMain:v1.12.0}NonEDBranchIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationMultiIDType", propOrder = {
    "name"
})
public class OrganizationMultiIDType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlAttribute(name = "OPEID")
    protected String opeid;
    @XmlAttribute(name = "NCHELPID")
    protected String nchelpid;
    @XmlAttribute(name = "NonEDBranchID")
    protected String nonEDBranchID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the opeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPEID() {
        return opeid;
    }

    /**
     * Sets the value of the opeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPEID(String value) {
        this.opeid = value;
    }

    /**
     * Gets the value of the nchelpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCHELPID() {
        return nchelpid;
    }

    /**
     * Sets the value of the nchelpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCHELPID(String value) {
        this.nchelpid = value;
    }

    /**
     * Gets the value of the nonEDBranchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEDBranchID() {
        return nonEDBranchID;
    }

    /**
     * Sets the value of the nonEDBranchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEDBranchID(String value) {
        this.nonEDBranchID = value;
    }

}
