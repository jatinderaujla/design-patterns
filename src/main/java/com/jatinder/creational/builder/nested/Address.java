package com.jatinder.creational.builder.nested;

public class Address {
    private Integer id;
    private String address;

    private Address(AddressBuilder addressBuilder){
        this.id = addressBuilder.id;
        this.address = addressBuilder.address;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public static AddressBuilder builder(){
        return new AddressBuilder();
    }

    public static class AddressBuilder {
        private Integer id;
        private String address;

        private AddressBuilder(){

        }

        public AddressBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public AddressBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Address build(){
            if(address == null || address.trim().isEmpty()) throw new IllegalStateException("Address cannot be empty");
            return new Address(this);
        }
    }
}
