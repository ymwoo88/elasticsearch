package com.example.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository("bookRepository")
public interface BookRepository extends ElasticsearchRepository<Book, String> {
}
