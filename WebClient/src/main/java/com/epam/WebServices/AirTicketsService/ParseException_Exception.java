
package com.epam.WebServices.AirTicketsService;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ParseException", targetNamespace = "http://localhost:1986/wss/AirTickets")
public class ParseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ParseException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ParseException_Exception(String message, ParseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ParseException_Exception(String message, ParseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.epam.WebServices.AirTicketsService.ParseException
     */
    public ParseException getFaultInfo() {
        return faultInfo;
    }

}
