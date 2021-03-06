
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerPluginV2VariableDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerPluginV2VariableDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentTypesRegex" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="possibleValuesRegex" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerPluginV2VariableDescriptor", propOrder = {
    "variableName",
    "mandatory",
    "description",
    "contentTypesRegex",
    "possibleValuesRegex"
})
public class WSTransformerPluginV2VariableDescriptor {

    @XmlElement(required = true)
    protected String variableName;
    protected boolean mandatory;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(nillable = true)
    protected List<String> contentTypesRegex;
    @XmlElement(nillable = true)
    protected List<String> possibleValuesRegex;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerPluginV2VariableDescriptor() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerPluginV2VariableDescriptor(final String variableName, final boolean mandatory, final String description, final List<String> contentTypesRegex, final List<String> possibleValuesRegex) {
        this.variableName = variableName;
        this.mandatory = mandatory;
        this.description = description;
        this.contentTypesRegex = contentTypesRegex;
        this.possibleValuesRegex = possibleValuesRegex;
    }

    /**
     * Gets the value of the variableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Sets the value of the variableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the contentTypesRegex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentTypesRegex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentTypesRegex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContentTypesRegex() {
        if (contentTypesRegex == null) {
            contentTypesRegex = new ArrayList<String>();
        }
        return this.contentTypesRegex;
    }

    /**
     * Gets the value of the possibleValuesRegex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possibleValuesRegex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossibleValuesRegex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPossibleValuesRegex() {
        if (possibleValuesRegex == null) {
            possibleValuesRegex = new ArrayList<String>();
        }
        return this.possibleValuesRegex;
    }

}
