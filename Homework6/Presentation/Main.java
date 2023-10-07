package Homework6.Presentation;

import Homework6.Data.InMemoryBookRepository;
import Homework6.Domain.Book;
import java.util.List;

public class Main {
    public static void main(String[] args){
        InMemoryBookRepository bookStore = new InMemoryBookRepository();

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Harry Potter", "Joanna K. Rolling", "59.99");
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", "29.99");
        Book book3 = new Book("3", "Война и Мир", "Лев Толстой", "45.55");
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);

        // Удаляем книгу из списка магазина
        bookStore.removeBook(book3);

        // Получаем список всех книг в магазине
        List<Book> allBooks = bookStore.getAllBooks();
        for (Book book : allBooks){
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}
