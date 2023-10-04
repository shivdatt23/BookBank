package com.bookstoremanagement.dao;

import com.bookstoremanagement.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookDao extends JpaRepository<MyBookList,Integer> {

}
