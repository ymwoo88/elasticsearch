package com.example.elasticsearch.repository;

import com.example.elasticsearch.domain.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
}
