package com.bookstoremanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "myBooks")
public class MyBookList {
    @Id
    private int id;

    private String name;
    private String author;
    private String price;

    public MyBookList(int id,  String name,String author, String price) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public MyBookList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
