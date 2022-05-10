package com.vinilemess.metallica.strategies;
import com.vinilemess.metallica.model.Customer;

import java.math.BigDecimal;

public interface TicketSellStrategy {

    public boolean sellTicket(Customer customer);

    public BigDecimal calculateDiscount(Customer customer);
}
