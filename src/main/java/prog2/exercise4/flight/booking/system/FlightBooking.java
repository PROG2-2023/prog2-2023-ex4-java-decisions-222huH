package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
public class FlightBooking {
        private String passengerFullName; 
        private String FlightCompany;
      
        private LocalDate departureDate;
        private LocalDate returnDate;
        private int childPassengers;
        private int adultPassengers;
        private int totalPassengers;
        private double departingTicketPrice;
        private double totalTicketPrice;
        private String SourceAirport;
        private String DestinationAirport;
        
       
        private  String  flightID;
       
      
     
        private enum BookingClass{

             First, 
             business,
             Economy;

        }

        private enum TripType{
            Oneway,
            Return;

        }
        
        private enum TripSource {

             Nanjing, 
             Beijing, 
             Shanghai,
              Oulu, 
              Helsinki,
             Paris ;


        }
 
    public enum TripDestination{

        Nanjing, 
        Beijing, 
        Shanghai,
         Oulu, 
         Helsinki,
         Paris ;
    }

        private  TripSource tripSource;
        private  BookingClass bookingClass;
        private  TripType tripType;
        private  TripDestination tripDestination;
        private  SourceAirport2 sourceAirport;
        private  DestinationAirport2  destinationAirport;  
        
    



        public FlightBooking(String name, LocalDate depart, LocalDate returnD, int child, int adult) {
            this.passengerFullName = name;
            this.departureDate = depart;
            this.returnDate = returnD;
            this.childPassengers =child;
            this.adultPassengers =adult;
        }

        public String getPassengerFullName() {
            return passengerFullName;
        }

        public void setPassengerFullName(String passengerFullName) {

            this.passengerFullName = passengerFullName;}


         public String getFlightID(){

           return flightID;

         }  

        public void setFlightID(String flightID){
              this.flightID=flightID;
        }

        public String getFlightCompany() {
            return FlightCompany;
        }

        public void setFlightCompany(String flightCompany) {
            FlightCompany = flightCompany;
        }

        public String getSourceAirport() {
            return SourceAirport;
        }

        public void setsourceAirport(String SourceAirport) {
           this. SourceAirport = SourceAirport;
        }

        public String getDestinationAirport() {
            return DestinationAirport;
        }

        public void setDestinationAirport(String DestinationAirport) {
            this.DestinationAirport = DestinationAirport;
        }

        public LocalDate getDepartureDate() {
            return departureDate;
        }

        public void setDepartureDate(LocalDate departureDate) {
            this.departureDate = departureDate;
        }

        public LocalDate getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
        }

        public int getChildPassengers() {
            return childPassengers;
        }

        public void setChildPassengers(int childPassengers) {
            this.childPassengers = childPassengers;
        }

        public int getAdultPassengers() {
            return adultPassengers;
        }

        public void setAdultPassengers(int adultPassengers) {
            this.adultPassengers = adultPassengers;
        }

        public int getTotalPassengers() {
            return totalPassengers;
        }

        public void setTotalPassengers(int totalPassengers) {
            this.totalPassengers = totalPassengers;
        }

        public double getDepartingTicketPrice() {
            return departingTicketPrice;
        }

        public void setDepartingTicketPrice(double departingTicketPrice) {
            this.departingTicketPrice = departingTicketPrice;
        }

        public double getTotalTicketPrice() {
            return totalTicketPrice;
        }

        public void setTotalTicketPrice(double totalTicketPrice) {
            this.totalTicketPrice = totalTicketPrice;
        }

        private String ticketNumber;
        public String setdestinationAirport;
       
        public String toString(){
            return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                    FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                    "Ticket Number: " + ticketNumber + "\n" +
                    "From " + tripSource + " to " + tripDestination + "\n" +
                    "Date of departure: " +departureDate + "\n" +
                    "Date of return: " + returnDate + "\n" +
                    "Total passengers: " + totalPassengers + "\n" +
                    "Total ticket price in Euros: " + totalTicketPrice;
        }

    public void setTotalPassengers(int child, int adult) {
      this.totalPassengers=childPassengers+adultPassengers;
    }

    public void setBookingClass(String  bookingClass) {

        switch(bookingClass){
            case "1":
          this.  bookingClass=BookingClass.First ;
            break;
            case "2":
           this.  bookingClass=BookingClass.business;
            break;
            case "3":
           this. bookingClass=BookingClass.Economy;          
           default:
           System.out.println("enter only the number 1, 2,3 ");
    }
}

public void setTripType(String  tripType){

      switch (tripType){
        case "1":
        this.tripType=TripType.Oneway;
        break;
        case "2":
        this.tripType=TripType.Return;
        default:
        System.out.println("enter only the number 1, 2");

      }

}

public void setTripSource(String   tripSource){
 
    switch(tripSource){
       case "1":
       this.tripSource=TripSource.Nanjing;
        break;
 
        case "2":
       this.tripSource=TripSource.Beijing;
        break;
 
        case "3":
       this.tripSource=TripSource.Shanghai;
        break;
 
        case "4":
       this.tripSource=TripSource.Oulu;
        break;
 
        case "5":
       this.tripSource=TripSource.Helsinki;
        break;
 
        case "6":
       this.tripSource=TripSource.Paris;
       default:
       System.out.println("enter only the number 1, 2,3 ,4,5,6");  
       
    }
 }


 public void setTripDestination(String  tripDestination){
 
    switch(tripDestination){
       case "1":
       this.tripDestination=TripDestination.Nanjing;
        break;
 
        case "2":
       this.tripDestination=TripDestination.Beijing;
        break;
 
        case "3":
       this.tripDestination=TripDestination.Shanghai;
        break;
        case "4":
       this.tripDestination=TripDestination.Oulu;
        break;
 
        case "5":
       this.tripDestination=TripDestination.Helsinki;
        break;
        case "6":
       this.tripDestination=TripDestination.Paris;
       default:
       System.out.println("enter only the number 1, 2,3 ,4,5,6");      
 
    }

 }
 
 public void setSourceAirport(String sourceAirport2) {
    if(sourceAirport2.equals(TripSource.Nanjing)){
    this.sourceAirport = SourceAirport2.Nanjing_Lukou_International_Airport;}
    else if(sourceAirport2.equals(TripSource.Beijing)){
    this.sourceAirport = SourceAirport2.Beijing_Capital_International_Airport;}
    else if(sourceAirport2.equals(TripSource.Oulu)){
   this.sourceAirport= SourceAirport2.Oulu_Airport;}
    else if(sourceAirport2.equals(TripSource.Helsinki)){
    this.sourceAirport = SourceAirport2.Helsinki_Airport;}
    else if(sourceAirport2.equals(TripSource.Shanghai)){
    this.sourceAirport = SourceAirport2.Shanghai_Pudong_International_Airport;}
    else if(sourceAirport2.equals(TripSource.Paris)){
    this.sourceAirport= SourceAirport2.Paris_Charles_de_Gaulle_Airport;}
    }
    public void setDestinationAirport(TripDestination result2) {
        if(result2.equals(TripDestination.Nanjing)){
        this.destinationAirport = DestinationAirport2.Nanjing_Lukou_International_Airport;}
        else if(result2.equals(TripDestination.Beijing)){
        this.destinationAirport= DestinationAirport2.Beijing_Capital_International_Airport;}
        else if(result2.equals(TripDestination.Oulu)){
        this.destinationAirport = DestinationAirport2.Oulu_Airport;}
        else if(result2.equals(TripDestination.Helsinki)){
        this.destinationAirport= DestinationAirport2.Helsinki_Airport;}
        else if(result2.equals(TripDestination.Shanghai)){
        this.destinationAirport = DestinationAirport2.Shanghai_Pudong_International_Airport;}
        else if(result2.equals(TripDestination.Paris)){
        this.destinationAirport = DestinationAirport2.Paris_Charles_de_Gaulle_Airport;}
   }

    public enum SourceAirport2 {
         Nanjing_Lukou_International_Airport,
         Beijing_Capital_International_Airport, 
         Shanghai_Pudong_International_Airport, 
         Oulu_Airport, 
         Helsinki_Airport,
         Paris_Charles_de_Gaulle_Airport;
    }

    public enum DestinationAirport2{
        Nanjing_Lukou_International_Airport,
        Beijing_Capital_International_Airport,
        Shanghai_Pudong_International_Airport,
        Oulu_Airport,
        Helsinki_Airport, 
        Paris_Charles_de_Gaulle_Airport;
    }

    public static String math(int length) {
        String alphabetsInUpperCase = "aqi";
        String numbers = "19";
        String allCharacters = alphabetsInUpperCase + numbers;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * allCharacters.length());
            a.append(allCharacters.charAt(randomIndex));
        }
        return a.toString();
    }
    public String getTicketNumber() {
        String Ticketnumber;
        String s= math(4);
        if(tripType == (TripType.Oneway)) {
            Ticketnumber = "11";
            if(bookingClass == (BookingClass.First)){
                Ticketnumber = Ticketnumber + "F" + s;
                if((tripSource == TripSource.Oulu || tripSource == TripSource.Paris || tripSource == TripSource.Helsinki) && (tripDestination == TripDestination.Paris || tripDestination == TripDestination.Oulu || tripDestination == TripDestination.Helsinki)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((tripSource == TripSource.Nanjing || tripSource == TripSource.Beijing || tripSource == TripSource.Shanghai) && (tripDestination == TripDestination.Nanjing || tripDestination == TripDestination.Beijing || tripDestination == TripDestination.Shanghai)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(bookingClass == BookingClass.business) {
                Ticketnumber = Ticketnumber + "B" + s;
                if((tripSource == TripSource.Oulu || tripSource == TripSource.Paris || tripSource == TripSource.Helsinki) && (tripDestination == TripDestination.Paris || tripDestination == TripDestination.Oulu || tripDestination == TripDestination.Helsinki)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((tripSource == TripSource.Nanjing || tripSource == TripSource.Beijing || tripSource == TripSource.Shanghai) && (tripDestination == TripDestination.Nanjing || tripDestination == TripDestination.Beijing || tripDestination == TripDestination.Shanghai)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(bookingClass == BookingClass.Economy) {
                Ticketnumber = Ticketnumber + "E" + s;
                if((tripSource == TripSource.Oulu || tripSource == TripSource.Paris || tripSource == TripSource.Helsinki) && (tripDestination == TripDestination.Paris || tripDestination == TripDestination.Oulu || tripDestination == TripDestination.Helsinki)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((tripSource == TripSource.Nanjing || tripSource == TripSource.Beijing || tripSource == TripSource.Shanghai) && (tripDestination == TripDestination.Nanjing || tripDestination == TripDestination.Beijing || tripDestination == TripDestination.Shanghai)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            }
        } else {
            Ticketnumber = "22";
            if(bookingClass == BookingClass.First){
                Ticketnumber = Ticketnumber + "F" + s;
                if((tripSource == TripSource.Oulu || tripSource == TripSource.Paris || tripSource == TripSource.Helsinki) && (tripDestination == TripDestination.Paris || tripDestination == TripDestination.Oulu || tripDestination == TripDestination.Helsinki)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((tripSource == TripSource.Nanjing || tripSource == TripSource.Beijing || tripSource == TripSource.Shanghai) && (tripDestination == TripDestination.Nanjing || tripDestination == TripDestination.Beijing || tripDestination == TripDestination.Shanghai)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(bookingClass == BookingClass.business) {
                Ticketnumber = Ticketnumber + "B" + s;
                if((tripSource == TripSource.Oulu || tripSource == TripSource.Paris || tripSource == TripSource.Helsinki) && (tripDestination == TripDestination.Paris || tripDestination == TripDestination.Oulu || tripDestination == TripDestination.Helsinki)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((tripSource == TripSource.Nanjing || tripSource == TripSource.Beijing || tripSource == TripSource.Shanghai) && (tripDestination == TripDestination.Nanjing || tripDestination == TripDestination.Beijing || tripDestination == TripDestination.Shanghai)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(bookingClass == BookingClass.Economy) {
                Ticketnumber = Ticketnumber + "E" + s;
                if((tripSource == TripSource.Oulu || tripSource == TripSource.Paris || tripSource == TripSource.Helsinki) && (tripDestination == TripDestination.Paris || tripDestination == TripDestination.Oulu || tripDestination == TripDestination.Helsinki)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((tripSource == TripSource.Nanjing || tripSource == TripSource.Beijing || tripSource == TripSource.Shanghai) && (tripDestination == TripDestination.Nanjing || tripDestination == TripDestination.Beijing || tripDestination == TripDestination.Shanghai)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            }
        }

        return Ticketnumber;
    }


    public void setDepartingTicketPrice(int childPassengers, int adultPassengers) {
        double departingTicketPrice = 0.00;
        if((tripSource == TripSource.Oulu || tripSource  == TripSource.Paris || tripSource == TripSource.Helsinki) && (tripDestination == TripDestination.Paris 
        || tripDestination == TripDestination.Oulu || 
        tripDestination == TripDestination.Helsinki)) {
            departingTicketPrice = 40;
        }else if((tripSource == TripSource.Nanjing 
        || tripSource == TripSource.Beijing 
        || tripSource == TripSource.Shanghai) && (tripDestination == TripDestination.Nanjing || tripDestination == TripDestination.Beijing 
        || tripDestination == TripDestination.Shanghai)){
            departingTicketPrice = 21;
        }
        else {
            departingTicketPrice = 21;
        }
        if(bookingClass == BookingClass.First) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers  + 30;
        } else if(bookingClass == BookingClass.business) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 20;
        } else if(bookingClass == BookingClass.Economy) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 10;
        }
    }
    public String getTripSource() {
        return null;
    }

    public String getTripDestination() {
        return null;
    }





}





