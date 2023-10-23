package com.jatinder.creational.builder.nested;

public class Employee {
    private Integer id;
    private String name;
    private Address address;

    private Employee(EmployeeBuilder employeeBuilder){
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
        this.address = employeeBuilder.address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder{
        private Integer id;
        private String name;
        private Address address;

        private EmployeeBuilder(){

        }

        public EmployeeBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Employee build(){
            if(address == null) throw new IllegalStateException("Address cannot be null");
            return new Employee(this);
        }
    }
}
