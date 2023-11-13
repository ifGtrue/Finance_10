package com.example.finance;

public class Item {
    private String title;
    private String money;
    private String date;
    public Item(String title, String money,String date){
        this.title =title;
        this.money = money;
        this.date = date;
    }

    public String getMoney() {
        return money;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }
}

