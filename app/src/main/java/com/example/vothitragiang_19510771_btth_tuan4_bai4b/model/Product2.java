package com.example.vothitragiang_19510771_btth_tuan4_bai4b.model;

public class Product2 {
    private int id;
    private String name;
    private int discountPrice;
    private int discount;

    public Product2(int id, String name, int discountPrice,int discount){
        this.id = id;
        this.name = name;
        this.discountPrice = discountPrice;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }
}
