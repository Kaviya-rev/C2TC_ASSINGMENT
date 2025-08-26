package com.kavya.assignment5;

import TicketBooking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String ticketInput = sc.nextLine();
            if (ticketInput.isEmpty()) break; // Stop on empty input

            String[] ticketData = ticketInput.split(",");
            String stageEvent = ticketData[0];
            String customer = ticketData[1];
            int noOfSeats = Integer.parseInt(ticketData[2]);

            // Create TicketBooking object
            TicketBooking ticket = new TicketBooking(stageEvent, customer, noOfSeats);

            // Read payment mode
            int paymentMode = Integer.parseInt(sc.nextLine());

            ticket.displayTicketDetails();

            switch (paymentMode) {
                case 1: // Cash
                    double cashAmount = Double.parseDouble(sc.nextLine());
                    ticket.makePayment(cashAmount);
                    break;
                case 2: // Wallet
                    double walletAmount = Double.parseDouble(sc.nextLine());
                    String walletNumber = sc.nextLine();
                    ticket.makePayment(walletAmount, walletNumber);
                    break;
                case 3: // Credit card
                    String holderName = sc.nextLine();
                    double cardAmount = Double.parseDouble(sc.nextLine());
                    String cardType = sc.nextLine();
                    String ccv = sc.nextLine();
                    ticket.makePayment(holderName, cardAmount, cardType, ccv);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        sc.close();
    }
}
