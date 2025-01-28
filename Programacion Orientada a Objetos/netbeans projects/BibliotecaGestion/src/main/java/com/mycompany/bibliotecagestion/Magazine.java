/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecagestion;

/**
 *
 * @author emiag
 */
public class Magazine extends Material{
    int issueNumber;
    String title;
    String author;
    int year;

    public Magazine(String title, String author, int year, int issueNumber) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
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
        return "Magazine{" + "issueNumber\"M=" + issueNumber + ", title=" + title + ", author=" + author + ", year=" + year + '}';
    }
    
}
