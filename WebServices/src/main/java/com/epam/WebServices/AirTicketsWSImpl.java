package com.epam.WebServices;

import com.epam.Data.FlyInfo;
import com.epam.Data.FlyTicket;
import com.epam.Data.Human;
import com.epam.Data.TicketStatus;
import com.epam.DateManagers.FlyInfoManager;
import com.epam.DateManagers.TicketManager;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.IOException;
import java.text.ParseException;

@WebService(targetNamespace="http://localhost:1986/wss/AirTickets",
        portName="AirTicketsPort",
        name="AirTickets",
        serviceName="AirTicketsService")
public class AirTicketsWSImpl implements AirTicketsWS {

    @Override
    public int bookFlyTicket(String FlyID, Human human) throws ParseException, IOException {
        FlyInfo flyInfo = FlyInfoManager.getFlyInfo(FlyID);
        if (flyInfo != null) {
            FlyTicket flyTicket = TicketManager.createNewTicket(human, flyInfo);
            TicketManager.writeTicketInfo(flyTicket);
            return flyTicket.getTicketNumber();
        } else {
            return -1;
        }
    }

    @Override
    public FlyTicket getTicketByNumber(String idTicket) throws ParseException {
        FlyTicket flyTicket = TicketManager.getFlyTicket(idTicket);
        if (flyTicket != null){
            return flyTicket;
        } else {
            return null;
        }
    }



    @Override
    public boolean payForFlyTicket(@WebParam(name="idTicket") String idTicket) throws ParseException {
        FlyTicket flyTicket = TicketManager.getFlyTicket(idTicket);
        if ((flyTicket != null) && (flyTicket.getTicketStatus() == TicketStatus.booked))  {
            flyTicket.setTicketStatus(TicketStatus.paidfor);
            TicketManager.writeTicketInfo(flyTicket);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteTicketById(@WebParam(name="idTicket") String idTicket) throws ParseException {
        FlyTicket flyTicket = TicketManager.getFlyTicket(idTicket);
        if ((flyTicket != null) && (flyTicket.getTicketStatus() == TicketStatus.booked)) {
            TicketManager.removeTicket(idTicket);
            return true;
        } else {
            return false;
        }
    }


}