package com.epam.WebServices;


import javax.xml.ws.Endpoint;



public class AirTicketsWSPublisher {

        public static void main (String[]args){
            try {
                Endpoint.publish("http://localhost:1986/wss/AirTickets",
                        new AirTicketsWSImpl());
            } catch (Exception e){
                e.printStackTrace();
            }
    }

}
