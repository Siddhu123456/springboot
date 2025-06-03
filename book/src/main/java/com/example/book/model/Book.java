package com.example.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    private String bookName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookID;
    private int bookPrice;
    private String author;

    public Book() {}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bookName, long bookID, int bookPrice, String author) {
        this.bookName = bookName;
        this.bookID = bookID;
        this.bookPrice = bookPrice;
        this.author = author;
    }
}
