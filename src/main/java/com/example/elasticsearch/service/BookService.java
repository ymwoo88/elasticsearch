package com.example.elasticsearch.service;

import com.example.elasticsearch.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> selectAll();
    Book selectById(String Id);
    void save(Book book);
    Optional<Book> findByBook(String id);
    List<Book> findAll();
}
