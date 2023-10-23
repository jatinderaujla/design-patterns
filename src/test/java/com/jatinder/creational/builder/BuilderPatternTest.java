package com.jatinder.creational.builder;


import com.jatinder.creational.builder.nested.Address;
import com.jatinder.creational.builder.nested.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuilderPatternTest {

    @Test
    void simpleBuilderPatternTest(){
        Student student = Student.builder().setAge(18).setName("John").setId(1).build();

        assertEquals(18, student.getAge());
        assertEquals("John", student.getName());
        assertEquals(1, student.getId());

    }

    @Test
    void addressSimpleBuilderPatternTest() {
        Address address = Address.builder().setAddress("XYZ, street").setId(1).build();
        assertEquals(1, address.getId());
        assertEquals("XYZ, street", address.getAddress());
    }


    @Test
    void nestedBuilderPatternTest() {
        Address address = Address.builder().setId(1).setAddress("XYZ, street").build();
        Employee employee = Employee.builder().setId(1).setName("John").setAddress(address).build();

        assertEquals(1, employee.getId());
        assertEquals("John", employee.getName());

        assertNotNull(employee.getAddress());
        assertEquals(1, employee.getAddress().getId());
        assertEquals("XYZ, street", employee.getAddress().getAddress());
    }
}
