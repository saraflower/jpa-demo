package com.saraflower.jpademo.bootstrap;

import com.saraflower.jpademo.domain.Book;
import com.saraflower.jpademo.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"local", "default"})
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookRepo bookRepo;

    @Override
    public void run(String... args) {
        bookRepo.deleteAll();

        Book book1 = new Book("The Great Book I", "1", "The Great Publisher", 500L);
        Book book2 = new Book("The Great Book II", "2", "The Great Publisher", 550L);

        bookRepo.save(book1);
        bookRepo.save(book2);

    }
}
