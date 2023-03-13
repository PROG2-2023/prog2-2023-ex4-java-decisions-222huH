package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Main 
{
   
    public static void main( String[] args )
    {
        String depart = "2023-03-09";
        LocalDate departD = LocalDate.parse(depart);
        String returnD = "2023-03-10";
        LocalDate returnDate = LocalDate.parse(returnD);
        Random r=new Random();
        int a =r.nextInt(100)+100;
        String flightID="FOF"+a+"IN";
        String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT"; 
        Scanner  reader = new Scanner(System.in);
         String   bookingClass=reader.nextLine();
         String   tripType=reader.nextLine();
         String  tripSource=reader.nextLine();
         String tripDestination=reader.nextLine();
         int  SourceAirport=reader.nextInt();
        
        FlightBooking f  = new FlightBooking("Kehan", departD, returnDate, 1, 3);
        f.setTotalPassengers(1,3);
        f.setPassengerFullName("huanku");
        f.getTicketNumber() ;  
        f.setFlightCompany("Flights-of-Fancy");
        f.setDepartureDate(LocalDate.parse("2023-03-09"));
        f.setReturnDate(LocalDate.parse("2023-03-09"));
        f.setTotalTicketPrice(222);        
        f.setBookingClass(bookingClass);
        f.setTripType(tripType);
        f.setTripSource(tripSource) ;
        f.setTripDestination(tripDestination);
        f.setSourceAirport(sourceAirport);
        f.setReturnDate(returnDate);
        System.out.println("Dear " + f.getPassengerFullName() + ". Thank you for booking your flight with " +
                f.getFlightCompany() + ".\n Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + f.getTicketNumber() + "\n" +
                "From " + f.getTripSource() + " to " + f.getTripDestination() + "\n" +
                "Date of departure: " + f.getDepartureDate() + "\n" +
                "Date of return: " + f.getReturnDate() + "\n" +
                "Total passengers: " + f.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + f.getTotalTicketPrice());
          reader.close();  
    }      
    }

