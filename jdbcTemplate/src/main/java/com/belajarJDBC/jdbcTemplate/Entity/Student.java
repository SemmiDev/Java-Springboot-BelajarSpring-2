package com.belajarJDBC.jdbcTemplate.Entity;

public class Student {

    private int id;
    private String name;
    private String gender;
    private String email;
    private String country;

    public Student(int id, String name, String gender, String email, String country) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.country = country;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}