package com.example.springbootproject.repository.impl;

import com.example.springbootproject.model.Book;
import com.example.springbootproject.repository.BookRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return List.of();
    }
}
