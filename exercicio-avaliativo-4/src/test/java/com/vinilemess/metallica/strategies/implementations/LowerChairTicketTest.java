package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LowerChairTicketTest {

    private Customer regularCustomer = new Customer("Daniel", LocalDate.of(2003, 9, 02), false);
    private Customer studentCustomer = new Customer("Vinicius", LocalDate.of(2003, 9, 02), true);
    private Customer elderCustomer = new Customer("Flavio", LocalDate.of(1960, 9, 02), false);
    private TicketSellContext context = new TicketSellContext(new LowerChairTicket());

    @Test
    void shouldSellLowerChairTicketSuccessfully() {
        assertEquals("Daniel have successfully bought the a lower chair ticket, price : $200", context.executeSell(regularCustomer));
        assertEquals("Vinicius have successfully bought the a lower chair ticket, price : $100.0", context.executeSell(studentCustomer));
        assertEquals("Flavio have successfully bought the a lower chair ticket, price : $80.0", context.executeSell(elderCustomer));
    }
    @Test
    void shouldValidateLowerChairTicketSellWithInvalidCustomer() {
        assertThrows(IllegalCallerException.class, () -> context.executeSell(null), "Customer cannot be null!");
    }
}