package com.company;

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public <BookClass> Book(String bookTitle) {
        // Implement this method
        BookClass book = new BookClass;
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
    }

    // Returns true if the book is rented, false otherwise
    public void isBorrowed() {
        // Implement this method
    }

    // Returns the title of the book
    public String getTitle() {
        // Implement this method
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("The Coldest Winter Ever): " + example.getTitle());
        System.out.println("The Coldest Winter Ever): " +.isBorrowed());
        example.rented();
        System.out.println("The Coldest Winter Ever) : " + .isBorrowed());
        example.returned();
        System.out.println("The Coldest Winter Ever): " +.isBorrowed());
    }

    private void rented() {
    }