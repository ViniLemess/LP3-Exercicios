package com.vinilemess.metallica.strategies.implementations;

import com.vinilemess.metallica.model.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CabinTicketTest {

    private Customer regularCustomer = new Customer("Daniel", LocalDate.of(2003, 9, 02), false);
    private Customer studentCustomer = new Customer("Vinicius", LocalDate.of(2003, 9, 02), true);
    private Customer elderCustomer = new Customer("Flavio", LocalDate.of(1960, 9, 02), false);
    private TicketSellContext context = new TicketSellContext(new CabinTicket());

    @Test
    void shouldSellCabinTicketSuccessfully() {
        assertEquals("Daniel have successfully bought the cabin ticket, price : $750", context.executeSell(regularCustomer));
        assertEquals("Vinicius have successfully bought the cabin ticket, price : $750", context.executeSell(studentCustomer));
        assertEquals("Flavio have successfully bought the cabin ticket, price : $750", context.executeSell(elderCustomer));
    }
    @Test
    void shouldValidateCabinTicketSellWithInvalidCustomer() {
        assertThrows(IllegalCallerException.class, () -> context.executeSell(null), "Customer cannot be null!");
    }
}