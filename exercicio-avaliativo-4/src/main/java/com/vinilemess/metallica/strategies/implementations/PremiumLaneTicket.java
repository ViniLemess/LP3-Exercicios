package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.TicketSellStrategy;

import java.math.BigDecimal;

public class PremiumLaneTicket implements TicketSellStrategy {
    private final BigDecimal premiumLanePrice = BigDecimal.valueOf(400);

    @Override
    public boolean sellTicket(Customer customer) {
        if (customer == null) {
            throw new IllegalCallerException("Customer cannot be null!");
        }
        BigDecimal finalPrice = premiumLanePrice.subtract(calculateDiscount(customer));
        System.out.println(customer.getName() + " have successfully bought the a premium lane ticket, price : $" + finalPrice);
        return true;
    }

    @Override
    public BigDecimal calculateDiscount(Customer customer) {
        if (customer.isStudent() || customer.isElderly()) {
            return premiumLanePrice.multiply(BigDecimal.valueOf(0.5));
        }
        return BigDecimal.valueOf(0);
    }
}
