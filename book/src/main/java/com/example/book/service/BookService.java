package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(long id){
        return bookRepository.findById(id);
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(long id){
        bookRepository.deleteById(id);
    }

    public Book updateBook(long id,Book updatedBook){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()){
            Book existingBook = optionalBook.get();
            existingBook.setBookName(updatedBook.getBookName());
            existingBook.setBookPrice(updatedBook.getBookPrice());
            existingBook.setAuthor(updatedBook.getAuthor());
            return bookRepository.save(existingBook);
        }
        else{
            throw new RuntimeException("Book with ID" + id + " not found.");
        }
    }
}
