package com.epam.DateManagers;

import com.epam.Data.*;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Currency;
import java.util.Date;

public class TicketManager {

    private final static String PATH_TO_JSON_TICKETS = "C:/DATABASE/tickets.json";
    private final static String PATH_TO_JSON_TICKETS_NUMBERS = "C:/DATABASE/ticketNumbers.json";

    public static FlyTicket createNewTicket(Human human, FlyInfo flyInfo) throws IOException {
        FlyTicket ticket;
        Date departureDate = flyInfo.getDepartureDate();
        Date arrivalDate = flyInfo.getArrivalDate();
        String departureCity = flyInfo.getDepartureCity();
        String arrivalCity = flyInfo.getArrivalCity();
        Money ticketCost = flyInfo.getCost();
        TicketStatus ticketStatus = TicketStatus.booked;
        long ticketNumber;
        ticketNumber = getUniqueTicketNumber();
        ticket = new FlyTicket(ticketNumber, departureCity, arrivalCity, departureDate, arrivalDate,
                ticketStatus, ticketCost, human);
        return ticket;
    }

    public static void writeTicketInfo(FlyTicket ticket){
        removeTicket(String.valueOf(ticket.getTicketNumber()));
        try {
            JSONObject ticketInfoJson = new JSONObject();
            ticketInfoJson.put(DaoConst.TICKET_NUMBER, ticket.getTicketNumber());
            ticketInfoJson.put(DaoConst.DEPARTURE_CITY, ticket.getDepartureCity());
            ticketInfoJson.put(DaoConst.ARRIVAL_CITY, ticket.getArrivalCity());
            String departureDate = DaoUtilits.datetoString(ticket.getDepartureDate(),DaoConst.FLY_DATE_FORMAT);
            ticketInfoJson.put(DaoConst.DEPARTURE_DATE, departureDate);
            String arrivalDate = DaoUtilits.datetoString(ticket.getArrivalDate(),DaoConst.FLY_DATE_FORMAT);
            ticketInfoJson.put(DaoConst.ARRIVAL_DATE, arrivalDate);
            ticketInfoJson.put(DaoConst.TICKET_STATUS, ticket.getTicketStatus().toString());
            ticketInfoJson.put(DaoConst.TICKET_COST_AMMOUNT, ticket.getTicketCost().getAmount());
            ticketInfoJson.put(DaoConst.TICKET_COST_CURRENCY, ticket.getTicketCost().getCurrency().getCurrencyCode());
            ticketInfoJson.put(DaoConst.FIRST_NAME, ticket.getHuman().getfName());
            ticketInfoJson.put(DaoConst.SECOND_NAME, ticket.getHuman().getlName());
            ticketInfoJson.put(DaoConst.PATRONOMIC, ticket.getHuman().getPatronomyc());
            String birthDate = DaoUtilits.datetoString(ticket.getHuman().getBirthDate(),DaoConst.BIRTH_DATE_FORMAT);
            ticketInfoJson.put(DaoConst.BIRTH_DATE, birthDate);
            JSONObject ticketID = DaoUtilits.getJsonObject(PATH_TO_JSON_TICKETS);
            ticketID.put(ticket.getTicketNumber(),ticketInfoJson);
            DaoUtilits.writeJsonToFile(ticketID, PATH_TO_JSON_TICKETS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean removeTicket(String ticketNumber){
        JSONObject ticketID = DaoUtilits.getJsonObject(PATH_TO_JSON_TICKETS);
        if (ticketID.containsKey(ticketNumber)) {
            ticketID.remove(ticketNumber);
            DaoUtilits.writeJsonToFile(ticketID, PATH_TO_JSON_TICKETS);
            return true;
        } else return false;
    }

    public static FlyTicket getFlyTicket(String TicketID) throws ParseException {
        JSONObject ticketID = DaoUtilits.getJsonObject(PATH_TO_JSON_TICKETS);
        if (ticketID.containsKey(TicketID)) {
            JSONObject ticketInfoJson = (JSONObject) ticketID.get(TicketID);
            FlyTicket flyTicket = getFlyTicketFromJson(ticketInfoJson);
            return flyTicket;
        } else return null;

    }

    private static FlyTicket getFlyTicketFromJson(JSONObject jsonObject) throws ParseException {
        long ticketNumber = (Long) jsonObject.get(DaoConst.TICKET_NUMBER);
        String departureCity = (String) jsonObject.get(DaoConst.DEPARTURE_CITY);
        String arrivalCity = (String) jsonObject.get(DaoConst.ARRIVAL_CITY);
        String departureDateString = (String)  jsonObject.get(DaoConst.DEPARTURE_DATE);
        Date departureDate = DaoUtilits.stringToDate(departureDateString, DaoConst.FLY_DATE_PATTERN);
        String arrivalDateString = (String)  jsonObject.get(DaoConst.ARRIVAL_DATE);
        Date arrivalDate = DaoUtilits.stringToDate(arrivalDateString, DaoConst.FLY_DATE_PATTERN);
        String ticketStatusString = (String) jsonObject.get(DaoConst.TICKET_STATUS);
        TicketStatus ticketStatus = TicketStatus.valueOf(ticketStatusString);
        Long ticketCostAmmountLong = (Long) jsonObject.get(DaoConst.TICKET_COST_AMMOUNT);
        BigInteger ticketCostAmmount = BigInteger.valueOf(ticketCostAmmountLong);
        Currency ticketCostCurrency = Currency.getInstance((String) jsonObject.get(DaoConst.TICKET_COST_CURRENCY));
        Money ticketCost = new Money(ticketCostAmmount, ticketCostCurrency);
        Human human = new Human();
        human.setfName((String) jsonObject.get(DaoConst.FIRST_NAME));
        human.setlName((String) jsonObject.get(DaoConst.SECOND_NAME));
        human.setPatronomyc((String) jsonObject.get(DaoConst.PATRONOMIC));
        String dateBirthdaySting = (String) jsonObject.get(DaoConst.BIRTH_DATE);
        human.setBirthDate(DaoUtilits.stringToDate(dateBirthdaySting, DaoConst.BIRTH_DATE_FORMAT));
        FlyTicket flyTicket = new FlyTicket(ticketNumber,departureCity,arrivalCity,departureDate,arrivalDate,
                ticketStatus,ticketCost,human);
        return flyTicket;
    }

    public static long getUniqueTicketNumber() throws IOException {
        long ticketNumber;

        JSONObject ticketNumbersJson = DaoUtilits.getJsonObject(PATH_TO_JSON_TICKETS_NUMBERS);
        if (ticketNumbersJson.containsKey("UniqueTicketNumber")) {
            ticketNumber = (Long) ticketNumbersJson.get("UniqueTicketNumber") + 1;
            ticketNumbersJson.put("UniqueTicketNumber", ticketNumber);
        } else {
            ticketNumber = 1;
            ticketNumbersJson.put("UniqueTicketNumber", ticketNumber);
        }
        DaoUtilits.writeJsonToFile(ticketNumbersJson, PATH_TO_JSON_TICKETS_NUMBERS);
        return ticketNumber;
    }

}
