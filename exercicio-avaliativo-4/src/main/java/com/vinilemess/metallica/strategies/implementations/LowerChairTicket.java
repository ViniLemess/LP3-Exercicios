package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.TicketSellStrategy;

import java.math.BigDecimal;

public class LowerChairTicket implements TicketSellStrategy {
    private final BigDecimal lowerChairPrice = BigDecimal.valueOf(200);

    @Override
    public boolean sellTicket(Customer customer) {
        if (customer == null) {
            throw new IllegalCallerException("Customer cannot be null!");
        }
        BigDecimal finalPrice = lowerChairPrice.subtract(calculateDiscount(customer)) ;
        System.out.println(customer.getName() + " have successfully bought the a lower chair ticket, price : $" + finalPrice);
        return true;
    }

    @Override
    public BigDecimal calculateDiscount(Customer customer) {
        if (customer.isElderly()) {
            return lowerChairPrice.multiply(BigDecimal.valueOf(0.6));
        } else if (customer.isStudent()) {
            return lowerChairPrice.multiply(BigDecimal.valueOf(0.5));
        }
        return BigDecimal.valueOf(0);
    }
}
