package cn.edu.tyut.controller;

import cn.edu.tyut.entity.Book;
import cn.edu.tyut.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 羊羊
 * @ClassName BookController
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:53
 * @Package_Name cn.edu.tyut.controller
 */
@Controller

public class BookController {
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @ResponseBody
    @GetMapping("/book")
    public String getBookById(@RequestParam("id") Integer id) {
        Book book = bookService.getBookById(id);
        return "book";
    }
}
