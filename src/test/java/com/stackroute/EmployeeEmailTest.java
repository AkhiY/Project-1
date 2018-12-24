package com.stackroute;

import com.stackroute.unittest.pe1.EmployeeEmail;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeEmailTest {

    @Test
    public void addEmployeeEmailId() {
        EmployeeEmail employeeEmail = new EmployeeEmail();
        String result = employeeEmail.addEmployeeEmailId("xam@gmail.com");
    }


}