package com.lhr13.first_springboot_lhr13.bean;

import javax.persistence.*;

@Entity(name = "t_music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mname", nullable = false)
    private  String mname;
    private String author;
    private Float price;

    @Transient
    private String description;

    public Music() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Music(Integer id, String mname, String author, Float price, String description) {
        this.id = id;
        this.mname = mname;
        this.author = author;
        this.price = price;
        this.description = description;
    }
}
