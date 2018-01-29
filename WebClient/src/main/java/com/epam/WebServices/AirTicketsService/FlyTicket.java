
package com.epam.WebServices.AirTicketsService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlyTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlyTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Human" type="{http://localhost:1986/wss/AirTickets}Human" minOccurs="0"/>
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ticketStatus" type="{http://localhost:1986/wss/AirTickets}ticketStatus" minOccurs="0"/>
 *         &lt;element name="ticketCost" type="{http://localhost:1986/wss/AirTickets}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlyTicket", propOrder = {
    "human",
    "ticketNumber",
    "departureCity",
    "arrivalCity",
    "departureDate",
    "arrivalDate",
    "ticketStatus",
    "ticketCost"
})
public class FlyTicket {

    @XmlElement(name = "Human")
    protected Human human;
    protected int ticketNumber;
    protected String departureCity;
    protected String arrivalCity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    protected TicketStatus ticketStatus;
    protected Money ticketCost;

    /**
     * Gets the value of the human property.
     * 
     * @return
     *     possible object is
     *     {@link Human }
     *     
     */
    public Human getHuman() {
        return human;
    }

    /**
     * Sets the value of the human property.
     * 
     * @param value
     *     allowed object is
     *     {@link Human }
     *     
     */
    public void setHuman(Human value) {
        this.human = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     */
    public int getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     */
    public void setTicketNumber(int value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCity(String value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCity(String value) {
        this.arrivalCity = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TicketStatus }
     *     
     */
    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketStatus }
     *     
     */
    public void setTicketStatus(TicketStatus value) {
        this.ticketStatus = value;
    }

    /**
     * Gets the value of the ticketCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTicketCost() {
        return ticketCost;
    }

    /**
     * Sets the value of the ticketCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTicketCost(Money value) {
        this.ticketCost = value;
    }

}
