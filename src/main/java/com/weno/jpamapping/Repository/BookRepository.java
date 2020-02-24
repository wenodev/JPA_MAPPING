package com.weno.jpamapping.Repository;

import com.weno.jpamapping.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
