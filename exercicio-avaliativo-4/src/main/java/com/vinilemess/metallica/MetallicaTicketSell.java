package com.vinilemess.metallica;

import com.vinilemess.metallica.enums.TicketCategory;
import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.implementations.*;

import java.time.LocalDate;
import java.util.Scanner;

public class MetallicaTicketSell {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        var name = readString("Type the name of the customer:");
        var dateOfBirth = readDate("Type the birth date of the customer (YEAR-MONTH-DAY)");
        var student = readString("Type true if the customer is a student else type false");
        Customer customer = new Customer(name, dateOfBirth, Boolean.valueOf(student));

        System.out.println("Type the ticket " + customer.getName() + " wish to buy:");
        System.out.println("Lane");
        System.out.println("Premium_Lane");
        System.out.println("Cabin");
        System.out.println("Lower_Chair");
        System.out.println("Higher_Chair");
        var category = TicketCategory.valueOf(readString("------------").toUpperCase());

        TicketSellContext context = null;
        switch (category) {
            case LANE -> context = new TicketSellContext(new LaneTicket());
            case PREMIUM_LANE -> context = new TicketSellContext(new PremiumLaneTicket());
            case CABIN -> context = new TicketSellContext(new CabinTicket());
            case LOWER_CHAIR -> context = new TicketSellContext(new LowerChairTicket());
            case HIGHER_CHAIR -> context = new TicketSellContext(new HigherChairTicket());
        }
        try {
            System.out.println(context.executeSell(customer));
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    private static String readString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    private static LocalDate readDate(String message) {
        LocalDate date = null;
        while (date == null) {
            try {
                date = LocalDate.parse(readString(message));
            } catch (Exception exception) {
                System.err.println("Type a valid date!");
            }
        }
        return date;
    }
}
