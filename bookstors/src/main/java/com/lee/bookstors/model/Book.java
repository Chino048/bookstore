package com.lee.bookstors.model;
import jakarta.persistence.*;
import jakarta.persistence.Id;



@Entity(name = "book")
@Table(name = "book")
public class Book {
    public Book() {
    }

    @Id
    @Column(name = "BookId")
    private int BookId;

    @Column(name = "名稱")
    private String BookName;

    @Column(name = "價格")
    private int Price;

    @Column(name = "作者")
    private String Author;

    public int getBookId() {
        return BookId;
    }
    public void setBookId(int bookId) {
        this.BookId = bookId;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        this.BookName = bookName;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        this.Price = price;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        this.Author = author;
    }

}
