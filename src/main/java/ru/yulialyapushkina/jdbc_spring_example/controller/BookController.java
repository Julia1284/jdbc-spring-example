package ru.yulialyapushkina.jdbc_spring_example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.yulialyapushkina.jdbc_spring_example.entity.Book;
import ru.yulialyapushkina.jdbc_spring_example.repository.BookRepository;


import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookRepository.findBookByID(id);
    }
}
