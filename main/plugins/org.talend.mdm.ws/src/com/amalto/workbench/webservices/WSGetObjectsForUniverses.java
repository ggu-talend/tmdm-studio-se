
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Return the xtentis object names for which a revision ID can be set
 * 			
 * 
 * <p>Java class for WSGetObjectsForUniverses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetObjectsForUniverses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regex" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetObjectsForUniverses", propOrder = {
    "regex"
})
public class WSGetObjectsForUniverses {

    protected List<String> regex;

    /**
     * Default no-arg constructor
     * 
     */
    public WSGetObjectsForUniverses() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSGetObjectsForUniverses(final List<String> regex) {
        this.regex = regex;
    }

    /**
     * Gets the value of the regex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegex() {
        if (regex == null) {
            regex = new ArrayList<String>();
        }
        return this.regex;
    }

}
