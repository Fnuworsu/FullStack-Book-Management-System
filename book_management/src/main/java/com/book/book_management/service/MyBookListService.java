package com.book.book_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book_management.model.myBookList;
import com.book.book_management.repository.MyBookRepository;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository mybook;

    public void saveMyBook(myBookList book) {
        mybook.save(book);
    }

    public List<myBookList> getAllBooks() {
        return mybook.findAll();
    }

    public void deleteById(int id) {
        mybook.deleteById(id);
    }

}
