package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book ksi =new Book(title, author);
        books.add(ksi);
        return ksi;

    }
}
