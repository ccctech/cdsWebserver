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
import org.pesc.core.coremain.v1_12.DelinquenciesType;


/**
 * Used in  AcademicProgramType
 * 
 * <p>Java class for AcademicSummaryE2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicSummaryE2Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:org:pesc:sector:AcademicRecord:v1.7.0}AcademicSummaryBaseType">
 *       &lt;sequence>
 *         &lt;element name="Delinquencies" type="{urn:org:pesc:core:CoreMain:v1.12.0}DelinquenciesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExitDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}ExitDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcademicSummaryE2Type", propOrder = {
    "delinquencies",
    "exitDate"
})
public class AcademicSummaryE2Type
    extends AcademicSummaryBaseType
{

    @XmlElement(name = "Delinquencies")
    protected List<DelinquenciesType> delinquencies;
    @XmlElement(name = "ExitDate")
    protected XMLGregorianCalendar exitDate;

    /**
     * Gets the value of the delinquencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delinquencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelinquencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelinquenciesType }
     * 
     * 
     */
    public List<DelinquenciesType> getDelinquencies() {
        if (delinquencies == null) {
            delinquencies = new ArrayList<DelinquenciesType>();
        }
        return this.delinquencies;
    }

    /**
     * Gets the value of the exitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitDate() {
        return exitDate;
    }

    /**
     * Sets the value of the exitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitDate(XMLGregorianCalendar value) {
        this.exitDate = value;
    }

}
