package com.example.elasticsearch;

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
@Document(indexName = "mkyong", type = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;
}
