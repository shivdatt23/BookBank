package com.bookstoremanagement.dao;

import com.bookstoremanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book,Integer> {

public Book findBookById(int id);
}
