
package com.epam.WebServices.AirTicketsService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteTicketById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteTicketById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTicketById", propOrder = {
    "idTicket"
})
public class DeleteTicketById {

    protected String idTicket;

    /**
     * Gets the value of the idTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTicket() {
        return idTicket;
    }

    /**
     * Sets the value of the idTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTicket(String value) {
        this.idTicket = value;
    }

}
