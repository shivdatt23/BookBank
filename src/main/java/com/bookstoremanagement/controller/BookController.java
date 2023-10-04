package com.bookstoremanagement.controller;

import com.bookstoremanagement.entity.Book;
import com.bookstoremanagement.entity.MyBookList;
import com.bookstoremanagement.service.BookServiceImpl;
import com.bookstoremanagement.service.MyBookService;
import com.bookstoremanagement.service.MyBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private MyBookServiceImpl myBookServiceImpl;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/book_register")
    public String bookRegister(){
        return "book_register";
    }

    @GetMapping("available_books")
    public ModelAndView getAllBooks(){
        //to send data from controller to view we will use ModelAndView instead of
//        String return
        List<Book> list=bookService.getAllBooks();

//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("books_available");
//        modelAndView.addObject("book",list);
//        instead of writing the above three commented statement we also write the below code in return statement
        return new ModelAndView("books_available","book",list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        bookService.addBook(book);
        return "redirect:/available_books";

    }
    @GetMapping("/my_books")
    public ModelAndView myBooks(){
        List<MyBookList> list=myBookServiceImpl.getAllMyBook();
        return new ModelAndView("MyBooks","mybook",list);
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Book b=bookService.getBookById(id);
        MyBookList myBookList=new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookServiceImpl.addBook(myBookList);

        return "redirect:/my_books";
    }

    @RequestMapping("/delete_book/{id}")
    public String deleteBook(@PathVariable("id") int id){
        bookService.deleteBook(id);
        return "redirect:/available_books";
    }

    @RequestMapping("/update_book/{id}")
    public String updateBook(@PathVariable("id") int id, Model model){
        Book b=bookService.getBookById(id);
        model.addAttribute("book",b);
        return "update_book";
    }


}
