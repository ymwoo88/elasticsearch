package com.example.elasticsearch.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "ymwoo", type = "book")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;
}
