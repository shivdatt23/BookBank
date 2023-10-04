package com.bookstoremanagement.controller;

import com.bookstoremanagement.service.MyBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookController {

    @Autowired
    private MyBookServiceImpl myBookService;

    @RequestMapping("/delete_mybook/{id}")
    public String removeMyBook(@PathVariable("id") int id){
        myBookService.removeMyBook(id);
        return "redirect:/my_books";
    }
}
