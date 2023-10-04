package com.bookstoremanagement.service;

import com.bookstoremanagement.dao.MyBookDao;
import com.bookstoremanagement.entity.MyBookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookServiceImpl implements MyBookService{
    @Autowired
    private MyBookDao myBookDao;

    @Override
    public void addBook(MyBookList book) {
        myBookDao.save(book);
    }

    @Override
    public List<MyBookList> getAllMyBook() {
        List<MyBookList> list=myBookDao.findAll();
        return list;
    }

    @Override
    public void removeMyBook(int id) {
        myBookDao.deleteById(id);
    }


}
