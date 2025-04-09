package com.lee.bookstors.repository;

import com.lee.bookstors.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepsitory  extends JpaRepository<Book, Integer> {
}


