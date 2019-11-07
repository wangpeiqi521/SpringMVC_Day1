package com.baizhi.entity;

public class Address {
    private String city;
    private String jiedao;

    public Address(String city, String jiedao) {
        this.city = city;
        this.jiedao = jiedao;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJiedao() {
        return jiedao;
    }

    public void setJiedao(String jiedao) {
        this.jiedao = jiedao;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", jiedao='" + jiedao + '\'' +
                '}';
    }
}
