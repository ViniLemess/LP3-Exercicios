package com.vinilemess.metallica;

import com.vinilemess.metallica.enums.TicketCategory;
import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.implementations.*;

import java.time.LocalDate;
import java.util.Scanner;

public class MetallicaTicketSell {
    public static void main(String[] args) {
        var name = readString("Type the name of the customer:");
        var dateOfBirth = LocalDate.parse(readString("Type the birth date of the customer (YEAR-MONTH-DAY)"));
        var student = Boolean.valueOf(readString("Type true if the customer is a student else type false:"));
        Customer customer = new Customer(name, dateOfBirth, student);

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
            context.executeSell(customer);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    private static String readString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
