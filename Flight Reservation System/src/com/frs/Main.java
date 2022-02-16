package com.frs;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n\t\t\t\t\t\t\t\t\t......FLIGHT RESERVATION SYSTEM.......");
        System.out.println("\nFlight Information:::");

        Flight f = new Flight("IC8080","AIR INDIA");
        System.out.println(f.getFlightDetails());

        System.out.println("Customer Option " +
                "for Regular Ticket:::");
        RegularTicket regular = new RegularTicket("MG Road", "MUMBAI", "MAHARASHTRA", "RAM", 20203014,
                "rk@gmail.com", "IC8086", "AIR INDIA", "BANG", "DEL", "10/10/21", "0900", "1420", "80AA78",
                "A10", 4500, "SNACKS");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(regular.getTicketDetails());
        System.out.println(regular.getDuration());
        System.out.println(regular.getSpecialServices());
        System.out.println(regular.checkedStatus());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Happy Flying");

        System.out.println("\n\n\n");

        System.out.println("Customer Option for Tourist Ticket:::\n");
        TouristTicket tt = new TouristTicket("NSB Road", "KOLKATA", "WEST BENGAL", "RAY", 985345,
                "abcd@gmail.com", "BR8087", "AIR INDIA", "KOL", "BANG", "09/09/21", "0900", "0300", "321A97",
                "B21", 3500, "ROYAL BENGAL");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(tt.getTicketDetails());
        System.out.println(tt.getDuration());
        System.out.println();
        tt.getTouristLocation();
        System.out.println();
        System.out.println(tt.checkedStatus());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Wishing you a Happy and Safe Flying\n");
        System.out.println(f.getFlightDetails());

        System.out.println("\n\n...Cancel Ticket...");
        tt.cancel();
        System.out.println("\n\n"+tt.getTicketDetails());
        System.out.println(tt.checkedStatus());
        System.out.println("\n\n"+f.getFlightDetails());

    }
}
