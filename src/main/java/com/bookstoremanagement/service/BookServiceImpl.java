package com.bookstoremanagement.service;

import com.bookstoremanagement.dao.BookDao;
import com.bookstoremanagement.entity.Book;
import com.bookstoremanagement.entity.MyBookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{




    @Autowired
    private BookDao bDao;


    @Override
    public void addBook(Book book) {
        bDao.save(book);
    }

    @Override
    public Book getBookById(int id) {
       Book book=bDao.findBookById(id);
        return book;
    }


    @Override
    public List<Book> getAllBooks() {
       List<Book> books= bDao.findAll();
        return books;
    }

    @Override
    public void deleteBook(int id) {
        bDao.deleteById(id);
    }

    @Override
    public void updateBook(Book book) {

    }
}
