package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.TicketSellStrategy;

import java.math.BigDecimal;

public class CabinTicket implements TicketSellStrategy {
    private final BigDecimal cabinPrice = BigDecimal.valueOf(750);

    @Override
    public boolean sellTicket(Customer customer) {
        if (customer == null) {
            throw new IllegalCallerException("Customer cannot be null!");
        }
        BigDecimal finalPrice = cabinPrice.subtract(calculateDiscount(customer));
        System.out.println(customer.getName() + " have successfully bought the a cabin ticket, price : $" + finalPrice);
        return true;
    }

    @Override
    public BigDecimal calculateDiscount(Customer customer) {
        return BigDecimal.valueOf(0);
    }
}
