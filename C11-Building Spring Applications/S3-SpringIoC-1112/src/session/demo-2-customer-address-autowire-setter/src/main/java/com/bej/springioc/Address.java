package com.bej.springioc;

public class Address {
    private int houseNo;
    private String street;
    private String city;
    private int zipCode;

    public Address(int houseNo, String street, String city, int zipCode) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address() {

    }


    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
