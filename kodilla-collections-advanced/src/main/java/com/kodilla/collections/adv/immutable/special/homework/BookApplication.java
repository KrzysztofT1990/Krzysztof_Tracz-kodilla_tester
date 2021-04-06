package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {

        Book book1 = BookManager.createBook("cos1", "cos2");
        Book book2 = BookManager.createBook("cos1", "cos2");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));

    }
}
