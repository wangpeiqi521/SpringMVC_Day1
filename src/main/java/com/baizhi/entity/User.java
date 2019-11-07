package com.baizhi.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private String username;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Address address;

    public User() {
    }

    public User(String username, Integer age, Date birthday, Address address) {
        this.username = username;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}


