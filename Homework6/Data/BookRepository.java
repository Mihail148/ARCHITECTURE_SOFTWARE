package Homework6.Data;

import Homework6.Domain.Book;
import java.util.List;

/*
 * Интерфейс BookRepository, определяющий методы для управления книгами в интернет-магазине.
 */

public interface BookRepository {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> getAllBooks();
}
