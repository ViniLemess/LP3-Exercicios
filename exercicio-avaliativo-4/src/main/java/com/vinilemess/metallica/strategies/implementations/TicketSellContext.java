package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import com.vinilemess.metallica.strategies.TicketSellStrategy;

public class TicketSellContext {
    private TicketSellStrategy strategy;

    public TicketSellContext(TicketSellStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeSell(Customer customer) {
        if (customer == null) {
            throw new IllegalCallerException("Customer cannot be null!");
        }
        return strategy.sellTicket(customer);
    }
}
