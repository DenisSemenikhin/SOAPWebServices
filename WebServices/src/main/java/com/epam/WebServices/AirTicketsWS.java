package com.epam.WebServices;

import com.epam.Data.FlyTicket;
import com.epam.Data.Human;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.text.ParseException;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface AirTicketsWS {

    @WebMethod
    public int bookFlyTicket(String FlyID, Human human) throws ParseException, IOException;

    @WebMethod
    FlyTicket getTicketByNumber(String idTicket) throws ParseException;

    @WebMethod
    public boolean payForFlyTicket(@WebParam(name="idTicket") String idTicket) throws ParseException;

    @WebMethod
    public boolean deleteTicketById(@WebParam(name="idTicket") String idTicket) throws ParseException;

}
