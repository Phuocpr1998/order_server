package com.study.android.testorderserver;

public class Order {
    private String email_owner;
    private String email_guest;
    private String name_rest;
    private int id_rest;
    private int id_discount;
    private Offer order;

    public Order() {
    }

    public Order(String email_owner, String email_guest) {
        this.email_owner = email_owner;
        this.email_guest = email_guest;
    }

    public Order(String email_owner, String email_guest, String name_rest, int id_rest, int id_discount, Offer order) {
        this.email_owner = email_owner;
        this.email_guest = email_guest;
        this.name_rest = name_rest;
        this.id_rest = id_rest;
        this.id_discount = id_discount;
        this.order = order;
    }

    public String getName_rest() {
        return name_rest;
    }

    public void setName_rest(String name_rest) {
        this.name_rest = name_rest;
    }

    public String getEmail_owner() {
        return email_owner;
    }

    public void setEmail_owner(String email_owner) {
        this.email_owner = email_owner;
    }

    public String getEmail_guest() {
        return email_guest;
    }

    public void setEmail_guest(String email_guest) {
        this.email_guest = email_guest;
    }

    @Override
    public String toString() {
        String data = "{\"email_owner\":" + "\"" + email_owner + "\"" + ", \"email_guest\":" + "\"" + email_guest + "\"" + "}";
        return data;
    }

    public Order(String email_owner, String email_guest, int id_rest, int id_discount, Offer order) {
        this.email_owner = email_owner;
        this.email_guest = email_guest;
        this.id_rest = id_rest;
        this.id_discount = id_discount;
        this.order = order;
    }


    public int getId_rest() {
        return id_rest;
    }

    public void setId_rest(int id_rest) {
        this.id_rest = id_rest;
    }

    public int getId_discount() {
        return id_discount;
    }

    public void setId_discount(int id_discount) {
        this.id_discount = id_discount;
    }

    public Offer getOrder() {
        return order;
    }

    public void setOrder(Offer order) {
        this.order = order;
    }
}
