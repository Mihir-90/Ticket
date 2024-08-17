class Ticket {
    String PassengerName;
    int FlightNo;
    double baseprice;
    Ticket(String PassengerName,int FlightNo,double baseprice){
        this.PassengerName = PassengerName;
        this.FlightNo = FlightNo;
        this.baseprice = baseprice;
    }
    void displayDetails(){
        System.out.println("PassengerName:"+PassengerName);
        System.out.println("Flight Number:"+FlightNo);
        System.out.println("Base Price"+baseprice);
    }
}
class DomesticTicket extends Ticket{
    double taxrate;
DomesticTicket(String PassengerName,int FlightNo,double baseprice,double taxrate){
super(PassengerName,FlightNo,baseprice);
this.taxrate = taxrate;
}
void displayDetails(){
    double totalPrice = baseprice + (baseprice*taxrate/100);
    super.displayDetails();
    System.out.println("Tax Rate:"+taxrate);
    System.out.println("Total Price"+totalPrice);
}
}
class InternationalTicket extends Ticket{
    double surcharge;
    InternationalTicket(String PassengerName,int FlightNo,double baseprice,double surcharge){
        super(PassengerName,FlightNo,baseprice);
        this.surcharge = surcharge;
    }
    void displayDetails(){
        double totalPrice = baseprice + surcharge;
        super.displayDetails();
        System.out.println("Surcharge:"+surcharge);
        System.out.println("Total Price"+totalPrice);
    }
}


