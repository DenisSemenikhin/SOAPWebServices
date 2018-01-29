
package com.epam.WebServices.AirTicketsService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.WebServices.AirTicketsService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookFlyTicket_QNAME = new QName("http://localhost:1986/wss/AirTickets", "bookFlyTicket");
    private final static QName _IOException_QNAME = new QName("http://localhost:1986/wss/AirTickets", "IOException");
    private final static QName _ParseException_QNAME = new QName("http://localhost:1986/wss/AirTickets", "ParseException");
    private final static QName _PayForFlyTicketResponse_QNAME = new QName("http://localhost:1986/wss/AirTickets", "payForFlyTicketResponse");
    private final static QName _DeleteTicketByIdResponse_QNAME = new QName("http://localhost:1986/wss/AirTickets", "deleteTicketByIdResponse");
    private final static QName _GetTicketByNumberResponse_QNAME = new QName("http://localhost:1986/wss/AirTickets", "getTicketByNumberResponse");
    private final static QName _GetTicketByNumber_QNAME = new QName("http://localhost:1986/wss/AirTickets", "getTicketByNumber");
    private final static QName _PayForFlyTicket_QNAME = new QName("http://localhost:1986/wss/AirTickets", "payForFlyTicket");
    private final static QName _DeleteTicketById_QNAME = new QName("http://localhost:1986/wss/AirTickets", "deleteTicketById");
    private final static QName _BookFlyTicketResponse_QNAME = new QName("http://localhost:1986/wss/AirTickets", "bookFlyTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.WebServices.AirTicketsService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link GetTicketByNumberResponse }
     * 
     */
    public GetTicketByNumberResponse createGetTicketByNumberResponse() {
        return new GetTicketByNumberResponse();
    }

    /**
     * Create an instance of {@link DeleteTicketByIdResponse }
     * 
     */
    public DeleteTicketByIdResponse createDeleteTicketByIdResponse() {
        return new DeleteTicketByIdResponse();
    }

    /**
     * Create an instance of {@link Human }
     * 
     */
    public Human createHuman() {
        return new Human();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link BookFlyTicketResponse }
     * 
     */
    public BookFlyTicketResponse createBookFlyTicketResponse() {
        return new BookFlyTicketResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link FlyTicket }
     * 
     */
    public FlyTicket createFlyTicket() {
        return new FlyTicket();
    }

    /**
     * Create an instance of {@link BookFlyTicket }
     * 
     */
    public BookFlyTicket createBookFlyTicket() {
        return new BookFlyTicket();
    }

    /**
     * Create an instance of {@link PayForFlyTicketResponse }
     * 
     */
    public PayForFlyTicketResponse createPayForFlyTicketResponse() {
        return new PayForFlyTicketResponse();
    }

    /**
     * Create an instance of {@link DeleteTicketById }
     * 
     */
    public DeleteTicketById createDeleteTicketById() {
        return new DeleteTicketById();
    }

    /**
     * Create an instance of {@link PayForFlyTicket }
     * 
     */
    public PayForFlyTicket createPayForFlyTicket() {
        return new PayForFlyTicket();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetTicketByNumber }
     * 
     */
    public GetTicketByNumber createGetTicketByNumber() {
        return new GetTicketByNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlyTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "bookFlyTicket")
    public JAXBElement<BookFlyTicket> createBookFlyTicket(BookFlyTicket value) {
        return new JAXBElement<BookFlyTicket>(_BookFlyTicket_QNAME, BookFlyTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForFlyTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "payForFlyTicketResponse")
    public JAXBElement<PayForFlyTicketResponse> createPayForFlyTicketResponse(PayForFlyTicketResponse value) {
        return new JAXBElement<PayForFlyTicketResponse>(_PayForFlyTicketResponse_QNAME, PayForFlyTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTicketByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "deleteTicketByIdResponse")
    public JAXBElement<DeleteTicketByIdResponse> createDeleteTicketByIdResponse(DeleteTicketByIdResponse value) {
        return new JAXBElement<DeleteTicketByIdResponse>(_DeleteTicketByIdResponse_QNAME, DeleteTicketByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketByNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "getTicketByNumberResponse")
    public JAXBElement<GetTicketByNumberResponse> createGetTicketByNumberResponse(GetTicketByNumberResponse value) {
        return new JAXBElement<GetTicketByNumberResponse>(_GetTicketByNumberResponse_QNAME, GetTicketByNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketByNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "getTicketByNumber")
    public JAXBElement<GetTicketByNumber> createGetTicketByNumber(GetTicketByNumber value) {
        return new JAXBElement<GetTicketByNumber>(_GetTicketByNumber_QNAME, GetTicketByNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForFlyTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "payForFlyTicket")
    public JAXBElement<PayForFlyTicket> createPayForFlyTicket(PayForFlyTicket value) {
        return new JAXBElement<PayForFlyTicket>(_PayForFlyTicket_QNAME, PayForFlyTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTicketById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "deleteTicketById")
    public JAXBElement<DeleteTicketById> createDeleteTicketById(DeleteTicketById value) {
        return new JAXBElement<DeleteTicketById>(_DeleteTicketById_QNAME, DeleteTicketById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlyTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:1986/wss/AirTickets", name = "bookFlyTicketResponse")
    public JAXBElement<BookFlyTicketResponse> createBookFlyTicketResponse(BookFlyTicketResponse value) {
        return new JAXBElement<BookFlyTicketResponse>(_BookFlyTicketResponse_QNAME, BookFlyTicketResponse.class, null, value);
    }

}
