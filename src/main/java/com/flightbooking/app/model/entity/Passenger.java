package com.flightbooking.app.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flightbooking.app.model.enumPacker.Gender;

import javax.persistence.*;


@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pid;

    private String pname;
    private Gender gender;
    private int age;

    @ManyToOne
    @JsonIgnore
    private UserBooking userbooking;

    Passenger() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserBooking getUserbooking() {
        return userbooking;
    }

    public void setUserbooking(UserBooking userbooking) {
        this.userbooking = userbooking;
    }
}
