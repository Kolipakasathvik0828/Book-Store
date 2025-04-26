package com.books1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books1.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
