package study.ch20.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Book {
    private String isbn;
    private String title;
    private String author;
    private int price;
}

interface Library {
    void addBook(Book b);
    Book findByIsbn(String isbn);
    List<Book> findByAuthor(String author);
    List<Book> findByPriceRange(int min, int max);
    void printAll();
}

class LibraryImpl implements Library {
    private Map<String, Book> bookMap;

    public LibraryImpl() {
        bookMap = new HashMap<>();
    }


    @Override
    public void addBook(Book b) {
        bookMap.put(b.getIsbn(), b);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookMap.get(isbn);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getAuthor().equals(author)) foundBooks.add(book);
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByPriceRange(int min, int max) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getPrice() >= min && book.getPrice() <= max) foundBooks.add(book);
        }
        return foundBooks;
    }

    @Override
    public void printAll() {
        for (Book book : bookMap.values()) {
            System.out.println(book);
        }
    }
}

public class Ex19 {
    public static void main(String[] args) {
        //978-1("자바의 정석", "남궁성", 35000),
        ////       978-2("스프링 입문", "김영한", 32000),
        ////       978-3("이펙티브 자바", "조슈아", 36000)
        String searchAuthor = "남궁성";
        Library library = new LibraryImpl();
        library.addBook(new Book("978-1", "자바의 정석", "남궁성", 35000));
        library.addBook(new Book("978-2", "스프링 입문", "김영한", 32000));
        library.addBook(new Book("978-3", "이펙티브 자바1", "조슈아", 36000));
        library.addBook(new Book("978-4", "이펙티브 자바2", "남궁성", 36000));
        library.addBook(new Book("978-5", "이펙티브 자바3", "조슈아", 36000));
        library.addBook(new Book("978-6", "이펙티브 자바4", "남궁성", 36000));
        library.addBook(new Book("978-7", "이펙티브 자바5", "김영한", 36000));

        Book foundBook = library.findByIsbn("978-2");
        System.out.println(foundBook);
        library.findByAuthor(searchAuthor).forEach(System.out::println);
        System.out.println(library.findByPriceRange(35000, 36000));
        library.printAll();
    }
}
