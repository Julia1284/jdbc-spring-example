package ru.yulialyapushkina.jdbc_spring_example.repository;

import ru.yulialyapushkina.jdbc_spring_example.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book findBookByID(Long id);
}
