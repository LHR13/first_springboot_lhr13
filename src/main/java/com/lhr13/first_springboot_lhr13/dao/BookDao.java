package com.lhr13.first_springboot_lhr13.dao;

import com.lhr13.first_springboot_lhr13.bean.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "book_cache")
public class BookDao {
    @Cacheable
    public Book getBookById(Integer id) {
        System.out.println("getBookById");
        Book book = new Book(1,"三国演义","罗贯中",29.8);
        return book;
    }


}
