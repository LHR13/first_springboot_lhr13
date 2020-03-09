package com.lhr13.first_springboot_lhr13.bean;

import javax.persistence.*;

@Entity(name = "t_music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private  String mname;

    @Column
    private String author;

    @Column
    private Float price;

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

    public Music(Integer id, String mname, String author, Float price) {
        this.id = id;
        this.mname = mname;
        this.author = author;
        this.price = price;
    }
}
