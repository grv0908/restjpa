package com.example.restjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Gaurav Rajput
 * Created on 26/11/19
 */

@Entity
public class User {

    @Id
    private int id;
    private String name;
    private String country;
    private int salary;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
