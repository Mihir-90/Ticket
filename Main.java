import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Domestic Ticket:");
        System.out.print("Passenger Name: ");
        String domesticName = sc.nextLine();
        System.out.print("Flight Number: ");
        int domesticFlightNumber = sc.nextInt();
        System.out.print("Base Price: ");
        double domesticBasePrice = sc.nextDouble();
        System.out.print("Tax Rate (%): ");
        double taxRate = sc.nextDouble();
        sc.nextLine();

        
        DomesticTicket domesticTicket = new DomesticTicket(domesticName, domesticFlightNumber, domesticBasePrice, taxRate);
        System.out.println("Passenger Details");
        domesticTicket.displayDetails();
        System.out.println("\nEnter details for International Ticket:");
        System.out.print("Passenger Name: ");
        String internationalName = sc.nextLine();
        System.out.print("Flight Number: ");
        int internationalFlightNumber = sc.nextInt();
        System.out.print("Base Price: ");
        double internationalBasePrice = sc.nextDouble();
        System.out.print("Surcharge: ");
        double surcharge = sc.nextDouble();
        InternationalTicket internationalTicket = new InternationalTicket(internationalName, internationalFlightNumber, internationalBasePrice, surcharge);
        System.out.println("Passenger Details");
        System.out.println("PassengerName:"+internationalName);
        System.out.println("Flight Number:"+internationalFlightNumber);
        System.out.println("Base Price"+internationalBasePrice);
        internationalTicket.displayDetails();

        sc.close();
    }
}