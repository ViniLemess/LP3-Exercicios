package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.TicketSellStrategy;

import java.math.BigDecimal;

public class LaneTicket implements TicketSellStrategy {
    private final BigDecimal lanePrice = BigDecimal.valueOf(250);

    @Override
    public String sellTicket(Customer customer) {
        if (customer == null) {
            throw new IllegalCallerException("Customer cannot be null!");
        }
        BigDecimal finalPrice = lanePrice.subtract(calculateDiscount(customer)) ;
        return customer.getName() + " have successfully bought the lane ticket, price : $" + finalPrice;
    }
    @Override
    public BigDecimal calculateDiscount(Customer customer) {
        if (customer.isStudent() || customer.isElderly()) {
            return lanePrice.multiply(BigDecimal.valueOf(0.5));
        }
        return BigDecimal.valueOf(0);
    }
}
