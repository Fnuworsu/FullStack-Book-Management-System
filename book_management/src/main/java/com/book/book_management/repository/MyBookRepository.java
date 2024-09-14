package com.book.book_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.book_management.model.myBookList;

@Repository
public interface MyBookRepository extends JpaRepository<myBookList, Integer> {

}
