package com.saraflower.jpademo;

import com.saraflower.jpademo.repo.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("local")
@ComponentScan(basePackages = {"package com.saraflower.jpademo.bootstrap"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MySQLIntegrationTest {
    @Autowired
    BookRepo bookRepo;

    @Test
    void testMySQL() {
        long count = bookRepo.count();
        assertThat(count).isEqualTo(2);
    }
}
