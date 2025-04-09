package com.lee.bookstors;

import com.lee.bookstors.model.Book;
import com.lee.bookstors.repository.BookRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController  {
//--查詢
    @GetMapping("/{id}")
    public Book getBookId(@PathVariable int id) {
        return bookRepsitory.findById(id)
                .orElse(null);
    }
//--新增
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookRepsitory.save(book);
    }
//--修改
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookRepsitory.findById(id)
                .map(book1 -> {
                    book1.setBookName(book.getBookName());
                    book1.setPrice(book.getPrice());
                    book1.setAuthor(book.getAuthor());
                    return bookRepsitory.save(book1);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){
        if (bookRepsitory.existsById(id)) {
            bookRepsitory.deleteById(id);
            return "已成功刪除書籍 ID : " + id;
        }else {
            return "找不到書籍 ID" + id;
        }
    }


    @Autowired
    private BookRepsitory bookRepsitory;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepsitory.findAll();
    }

}
