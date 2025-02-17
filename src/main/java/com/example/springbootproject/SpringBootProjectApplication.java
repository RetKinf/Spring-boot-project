package com.example.springbootproject;

import com.example.springbootproject.model.Book;
import com.example.springbootproject.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootProjectApplication {
    private final BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book book =  new Book();
                book.setTitle("Spring Boot Project");
                book.setAuthor("Andrzej");
                book.setIsbn("123456789");
                book.setPrice(BigDecimal.valueOf(100.0));
                bookService.save(book);
                System.out.println(bookService.findAll());
            }
        };
    }
}
