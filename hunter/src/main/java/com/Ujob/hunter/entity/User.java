package com.Ujob.hunter.entity;


public class User {
    private Long user_id;
    private String first_name;
    private String last_name;
    private String user_date;
    private String address;

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = id;
    }

    public User(String first_name, String last_name, String date, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_date = date;
        this.address = address;
    }

    public User() {

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }



    public String getDate() {
        return user_date;
    }

    public void setDate(String date) {
        this.user_date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date='" + user_date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
