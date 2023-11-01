package com.gebeya.friendAddress.Model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;


@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean married;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "friend_id", referencedColumnName = "id")
    private List<Address> addresses;

    public Friend() {
    }

    public Friend(String firstName, String lastName, int age, boolean married, List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.married = married;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "Id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", addresses=" + addresses +
                '}';
    }
}

