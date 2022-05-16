package com.vinilemess.metallica.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void mustInstantiateCustomerSuccessfully() {
        Customer customer = new Customer("Vinicius", LocalDate.of(2003, 9, 02), true);
        assertEquals("Vinicius", customer.getName());
        assertEquals(LocalDate.of(2003, 9, 02), customer.getBirthDate());
        assertEquals(true, customer.isStudent());
    }
    @Test
    void mustValidateInstanceOfCustomerWithInvalidName() {
        assertThrows(IllegalArgumentException.class, () ->
                new Customer(null, LocalDate.of(2003, 9, 02), true),
                "[Invalid name!]");
    }
    @Test
    void mustValidateInstanceOfCustomerWithInvalidBirthDate() {
        assertThrows(IllegalArgumentException.class, () ->
                        new Customer("Vinicius", null, true),
                "[Invalid birth date!]");
    }
    @Test
    void mustValidateInstanceOfCustomerWithInvalidStudentField() {
        assertThrows(IllegalArgumentException.class, () ->
                        new Customer("Vinicius", LocalDate.of(2003, 9, 02), null),
                "[Invalid student!]");
    }
}