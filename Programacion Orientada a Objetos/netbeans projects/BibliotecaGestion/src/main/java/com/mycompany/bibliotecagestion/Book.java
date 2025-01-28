/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecagestion;

/**
 *
 * @author emiag
 */
public class Book extends Material{
    String genre;
    String title;
    String author;
    int year;

    public Book(String genre, String title, String author, int year) {
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String getDetails() {
        return "Book{" + "genre=" + genre + ", title=" + title + ", author=" + author + ", year=" + year + '}';
    }
    
    
}
