package main;

import data.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Learner");
        System.out.println(book.getTitle());
        book.setAuthorName("Ajay Chavan");
        System.out.println(book.getAuthorName());
        book.setPublication(2022);
        System.out.println(book.getPublication());
        book.setIsbn("1234d");
        System.out.println(book.getIsbn());
    }
}
