package com.example.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("getBook")
    public Book selectOne() {
        return bookService.selectById("test");
    }

    @GetMapping("getBooks")
    public List<Book> selectAll() {
        return bookService.selectAll();
    }

    @PostMapping("book")
    public String save(@RequestBody Book book)
    {
        System.out.println(book);
        bookService.save(book);
        return "save..!";
    }

    @GetMapping("book")
    public Optional<Book> findByBook(@RequestParam String id)
    {
        return bookService.findByBook(id);
    }

    @GetMapping("books")
    public List<Book> findAll()
    {
        return bookService.findAll();
    }

}
