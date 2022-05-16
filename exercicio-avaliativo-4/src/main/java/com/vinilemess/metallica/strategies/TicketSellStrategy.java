package com.vinilemess.metallica.strategies;
import com.vinilemess.metallica.model.Customer;

import java.math.BigDecimal;

public interface TicketSellStrategy {

    public String sellTicket(Customer customer);

    public BigDecimal calculateDiscount(Customer customer);
}
