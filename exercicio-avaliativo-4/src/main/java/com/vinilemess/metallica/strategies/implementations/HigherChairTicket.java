package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.TicketSellStrategy;

import java.math.BigDecimal;

public class HigherChairTicket implements TicketSellStrategy {
    private final BigDecimal higherChairPrice = BigDecimal.valueOf(150);

    @Override
    public boolean sellTicket(Customer customer) {
        if (customer == null) {
            throw new IllegalCallerException("Customer cannot be null!");
        }
        BigDecimal finalPrice = higherChairPrice.subtract(calculateDiscount(customer)) ;
        System.out.println(customer.getName() + " have successfully bought the a higher chair ticket, price : $" + finalPrice);
        return true;
    }

    @Override
    public BigDecimal calculateDiscount(Customer customer) {
        if (customer.isElderly()) {
            return higherChairPrice.multiply(BigDecimal.valueOf(0.6));
        } else if (customer.isStudent()) {
            return higherChairPrice.multiply(BigDecimal.valueOf(0.5));
        }
        return BigDecimal.valueOf(0);
    }
}
