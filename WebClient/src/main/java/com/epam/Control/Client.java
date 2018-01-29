package com.epam.Control;

import com.epam.Model.Utilits;
import com.epam.Visual.ConsoleView;
import com.epam.WebServices.AirTicketsService.*;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.Date;



public class Client {

    private AirTickets airTickets;
    private Human human = null;
    private FlyTicket flyTicket;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public FlyTicket getTicket() {
        return flyTicket;
    }

    public void setTicket(FlyTicket ticket) {
        this.flyTicket = ticket;
    }

    Client (AirTickets airTickets){
        this.airTickets = airTickets;
    }


    public static void main(String[] args) throws DatatypeConfigurationException, IOException_Exception, ParseException_Exception, ParseException {
        AirTicketsService airTicketsService = new AirTicketsService();
        AirTickets airTickets = airTicketsService.getAirTicketsPort();
        Client client = new Client(airTickets);
        ConsoleView consoleView = new ConsoleView(client);
        consoleView.showMainMenu();
    }


    public Integer bookFlyTicket(String flyID) throws ParseException_Exception, IOException_Exception {
        Integer flyTicketID = airTickets.bookFlyTicket(flyID, human);
        FlyTicket flyTicket = airTickets.getTicketByNumber(flyTicketID.toString());
        setTicket(flyTicket);
        return flyTicketID;
    }

    public FlyTicket getFlyTicketByID(String flyTicketID) throws ParseException_Exception, IOException_Exception {
        FlyTicket flyTicket = airTickets.getTicketByNumber(flyTicketID);
        setTicket(flyTicket);
        return this.flyTicket;
    }

    public boolean paidForTicketByID(String flyTicketID) throws ParseException_Exception {
        boolean paidfor = airTickets.payForFlyTicket(flyTicketID);
        FlyTicket flyTicket = airTickets.getTicketByNumber(flyTicketID);
        setTicket(flyTicket);
        return paidfor;
    }

    public boolean deleteFlyTicketByID(String flyTicketID) throws ParseException_Exception {
        boolean deleteStatus = airTickets.deleteTicketById(flyTicketID);
        return deleteStatus;
    }

    public void acceptPersonalInformation(String fName, String lName, String patronomyc, String birthDateString) throws ParseException, DatatypeConfigurationException {
        Human customer = new Human();
        customer.setFName(fName);
        customer.setLName(lName);
        customer.setPatronomyc(patronomyc);
        Date birthDate = Utilits.stringToDate(birthDateString, Utilits.BIRTH_DATE_FORMAT);
        customer.setBirthDate(Utilits.datetoXMLGregorianCalendar(birthDate));
        setHuman(customer);
    }


}
