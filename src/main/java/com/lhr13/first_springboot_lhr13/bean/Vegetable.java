package com.lhr13.first_springboot_lhr13.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Vegetable {
    private String name;
    private String market;

    @JsonIgnore
    private double price;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date productionDate;

    @Override
    public String toString() {
        return "vegetables{" +
                "name='" + name + '\'' +
                ", market='" + market + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Vegetable() {
    }

    public Vegetable(String name, String market, double price, Date productionDate) {
        this.name = name;
        this.market = market;
        this.price = price;
        this.productionDate = productionDate;
    }
}
