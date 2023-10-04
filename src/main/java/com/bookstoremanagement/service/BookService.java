package com.bookstoremanagement.service;

import com.bookstoremanagement.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public void addBook(Book book);
    public Book getBookById(int id);
    public List<Book> getAllBooks();
    public void deleteBook(int id);
    public void updateBook(Book book);

}
