package com.bookstoremanagement.service;

import com.bookstoremanagement.entity.MyBookList;

import java.util.List;

public interface MyBookService {
    public void addBook(MyBookList book);
    public List<MyBookList> getAllMyBook();
    public void removeMyBook(int id);
}
