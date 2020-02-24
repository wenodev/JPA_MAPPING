package com.weno.jpamapping.Repository;

import com.weno.jpamapping.Entity.Book;
import com.weno.jpamapping.Entity.Category;
import com.weno.jpamapping.JpamappingApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BookRepositoryTest  extends JpamappingApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void create(){
        Optional<Category> category = categoryRepository.findById(2L);

        Book book = Book.builder()
                .title("title1")
                .category(category.get())
                .build();

        System.out.println( book.getCategory().getName());

        bookRepository.save(book);
        System.out.println("create book : " + book);
    }

}