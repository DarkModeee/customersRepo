package com.customer.demo.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private int  cusId;

    private String FirstName;

    private String LastName;

    private String email;
}
