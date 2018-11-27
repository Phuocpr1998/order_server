package com.study.android.testorderserver;

public class Offer {
    private String namedish;
    private int discount_percent;
    private String guest_email;
    private int total;

    public Offer(String namedish, int discount_percent, String guest_email, int total) {
        this.namedish = namedish;
        this.discount_percent = discount_percent;
        this.guest_email = guest_email;
        this.total = total;
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

    public void setTotal(int total) {
        this.total = total;
    }
}
