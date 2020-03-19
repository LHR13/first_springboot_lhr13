package com.lhr13.first_springboot_lhr13.dao;

import com.lhr13.first_springboot_lhr13.bean.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "book_cache")
public class BookDao {
    @Cacheable
    public Book getBookById(Integer) {

    }
}
