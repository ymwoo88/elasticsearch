package com.example.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> selectAll() {
        List<Book> bookList = new ArrayList<>();

        Book book1 = Book.builder()
                .id("1")
                .title("일번")
                .author("첫번째")
                .releaseDate("첫쨋날")
                .build();
        bookList.add(book1);

        Book book2 = Book.builder()
                .id("2")
                .title("이번")
                .author("두번째")
                .releaseDate("둘쨋날")
                .build();
        bookList.add(book2);

        return bookList;
    }

    @Override
    public Book selectById(String Id) {
        return Book.builder()
                .id("s")
                .title("혼자야")
                .author("쏠로")
                .releaseDate("고독한날")
                .build();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> findByBook(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {

        List<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(book -> {
            bookList.add(book);
        });

        return bookList;
    }
}
