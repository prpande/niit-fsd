package org.example;

public class Address
{
    private int houseNumber;
    private String streetName;
    private String city;
    private String country;
    private String zipCode;

    public void setHouseNumber(int houseNumber)
    {
        this.houseNumber = houseNumber;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public int getHouseNumber()
    {
        return houseNumber;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void print()
    {
        System.out.printf("# %d, %s\n%s, %s\n%s\n",
                getHouseNumber(), getStreetName(), getCity(), getCountry(), getZipCode());
    }
}
