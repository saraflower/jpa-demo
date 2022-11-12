package com.saraflower.jpademo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String isbn;
    private String publisher;
    private Long price;

    public Book(
            String title,
            String isbn,
            String publisher,
            Long price
    ) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.price = price;
    }
}
