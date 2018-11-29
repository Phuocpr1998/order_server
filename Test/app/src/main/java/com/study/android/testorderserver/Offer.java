package com.study.android.testorderserver;

import com.google.gson.annotations.JsonAdapter;

import java.util.Date;

@JsonAdapter(OrderSerialize.class)
public class Offer {
    private String namedish;
    private int discount_percent;
    private String guest_email;
    private int total;
    private int status;
    private Date date_order;

    public Offer(String namedish, int discount_percent, String guest_email, int total, int status, Date date_order) {
        this.namedish = namedish;
        this.discount_percent = discount_percent;
        this.guest_email = guest_email;
        this.total = total;
        this.status = status;
        this.date_order = date_order;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDate_order() {
        return date_order;
    }

    public void setDate_order(Date date_order) {
        this.date_order = date_order;
    }

    public Offer(String namedish, int discount_percent, String guest_email, int total) {
        this.namedish = namedish;
        this.discount_percent = discount_percent;
        this.guest_email = guest_email;
        this.total = total;
    }

    public Offer(String namedish, int discount_percent, String guest_email, int total, Date date) {
        this.namedish = namedish;
        this.discount_percent = discount_percent;
        this.guest_email = guest_email;
        this.total = total;
        this.date_order = date;
    }

    public Date getDate() {
        return date_order;
    }

    public void setDate(Date date) {
        this.date_order = date;
    }

    public Offer() {
    }

    public String getNamedish() {
        return namedish;
    }

    public void setNamedish(String namedish) {
        this.namedish = namedish;
    }

    public int getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(int discount_percent) {
        this.discount_percent = discount_percent;
    }

    public String getGuest_email() {
        return guest_email;
    }

    public void setGuest_email(String guest_email) {
        this.guest_email = guest_email;
    }

    public int getTotal() {
        return total;
    }

    public String getDateString(){
        return date_order.getYear() + "-" + date_order.getMonth() + "-" + date_order.getDate() + " " + date_order.getHours() + ":" + date_order.getMinutes() + ":" + date_order.getSeconds();
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
