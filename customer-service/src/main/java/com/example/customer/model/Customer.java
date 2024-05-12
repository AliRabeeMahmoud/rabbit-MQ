package com.example.customer.model;


import java.io.Serializable;

public class Customer  {
    private String name;

    private String city;

    private String phone;

    public Customer() {
    }

    public Customer(String name, String city, String phone) {
        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
