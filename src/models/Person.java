package models;
import java.util.Date;

// Generic Inheritable Person class

public class Person {
    private String name;
    private String email;
    private Date dateOfBirth;
    private Address address;

    Person(){
        this("", "", new Date(), new Address("", "", "", "", ""));
    }
    Person(String name, String email, Date dateOfBirth, Address address){
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    // Functionality

    // Implement here

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
