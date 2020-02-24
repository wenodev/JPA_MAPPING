package com.weno.jpamapping.Repository;

import com.weno.jpamapping.Entity.Book;
import com.weno.jpamapping.Entity.Category;
import com.weno.jpamapping.JpamappingApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.CacheAwareContextLoaderDelegate;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.Assert.*;

public class CategoryRepositoryTest extends JpamappingApplicationTests {

    @Autowired
    CategoryRepository categoryRepository;


    @Test
    public void create(){
        Category category = Category.builder()
                .name("user1")
                .build();
        categoryRepository.save(category);
        System.out.println("create user : " + category);
    }
}