/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecagestion;

/**
 *
 * @author emiag
 */
public class DigitalMedia extends Material{
    String format;
    String title;
    String author;
    int year;

    public DigitalMedia(String format, String title, String author, int year) {
        this.format = format;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getFormat() {
        return format;
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
        return "DigitalMedia{" + "format=" + format + ", title=" + title + ", author=" + author + ", year=" + year + '}';
    }
}
