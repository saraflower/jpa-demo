package com.saraflower.jpademo.repo;

import com.saraflower.jpademo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
