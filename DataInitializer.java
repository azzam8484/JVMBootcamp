package com.SpringJPA.Assignment3;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
@Component
public class DataInitializer {

    @Autowired
    private AuthorRepository authorRepository;

    @PostConstruct
    public void init() {
        Book book1 = new Book("Let us C");
        Book book2 = new Book("Algo Go");

        Author author1 = new Author();
        author1.setName("Azzam");
        author1.setAddress(new Address(101, "Budaun", "UP"));
        author1.setSubjects(Arrays.asList("Java", "C++", "DSA"));

        Author author2 = new Author();
        author2.setName("Shivam");
        author2.setAddress(new Address(102, "Noida", "UP"));
        author2.setSubjects(Arrays.asList("Python", "AI", "ML"));


        author1.getBooks().add(book1);
        author1.getBooks().add(book2);
        author2.getBooks().add(book1);
        author2.getBooks().add(book2);

        book1.getAuthors().add(author1);
        book1.getAuthors().add(author2);
        book2.getAuthors().add(author1);
        book2.getAuthors().add(author2);

        authorRepository.saveAll(List.of(author1, author2));


//        Author author = new Author();
//        author.setName("Azzam");
//        author.setAddress(new Address(101, "budaun", "UP"));
//        author.setSubjects(Arrays.asList("Java", "C++", "DBMS"));
//
//        Book b1 = new Book("Let us c");
//
//        Book b2 = new Book("Algo go");
//
//        author.getBooks().addAll(List.of(b1, b2));
//
//        authorRepository.save(author);

     

//        Author author = new Author();
//
//        Book book=new Book("Gyaan ki kitaab");
//        author.setName("Azzam");
//        author.setAddress(new Address(101, "budaun", "UP"));
//        author.setSubjects(Arrays.asList("Java", "C++", "DBMS"));
//        author.setBook(book);
//        authorRepository.save(author);

    }
}

