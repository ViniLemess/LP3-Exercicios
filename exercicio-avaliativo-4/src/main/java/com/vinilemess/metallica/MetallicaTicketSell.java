package com.vinilemess.metallica;

import com.vinilemess.metallica.enums.TicketCategory;
import com.vinilemess.metallica.model.Customer;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
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
        var category = TicketCategory.valueOf(readString("----------").toUpperCase());
    }
    private static String readString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
