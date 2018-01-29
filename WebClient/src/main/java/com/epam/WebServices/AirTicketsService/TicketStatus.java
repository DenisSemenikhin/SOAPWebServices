
package com.epam.WebServices.AirTicketsService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ticketStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="booked"/>
 *     &lt;enumeration value="paidfor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ticketStatus")
@XmlEnum
public enum TicketStatus {

    @XmlEnumValue("booked")
    BOOKED("booked"),
    @XmlEnumValue("paidfor")
    PAIDFOR("paidfor");
    private final String value;

    TicketStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketStatus fromValue(String v) {
        for (TicketStatus c: TicketStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
