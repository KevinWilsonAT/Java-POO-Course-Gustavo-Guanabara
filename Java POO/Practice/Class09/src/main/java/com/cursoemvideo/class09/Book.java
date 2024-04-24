/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class09;

/**
 *
 * @author kevin
 */
public class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Person reader;
    
    public String details() {
        return "Book:\n" + " title: " + title + ",\n author: " + author +
                ",\n totalPages: " + totalPages + ",\n currentPage: " +
                currentPage + ",\n open: " + open + ",\n reader: " + reader.getName() +
                ",\n age: " + reader.getAge()+ ",\n gender: " + reader.getGender();
    }
    
    // Special Methods

    public Book(String title, String author, int totalPages, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.open = false;
        this.currentPage = 0;
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void browse(int page) {
        if(page > this.getTotalPages()){
            System.out.println("Error. Page " + page + " does not exist on this book.");
            System.out.println("Book total pages: " + this.getTotalPages());
            System.out.println("=====================================================");
            this.currentPage = 0;
        }
        else{
            this.currentPage = page;
        }
    }

    @Override
    public void nextPage() {
        this.currentPage++;
    }

    @Override
    public void prevPage() {
        this.currentPage--;
    }
}
