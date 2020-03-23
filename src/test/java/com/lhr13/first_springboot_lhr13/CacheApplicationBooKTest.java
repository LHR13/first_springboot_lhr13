package com.lhr13.first_springboot_lhr13;

import com.lhr13.first_springboot_lhr13.bean.Book;
import com.lhr13.first_springboot_lhr13.dao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheApplicationBooKTest {
    @Autowired
    BookDao bookDao;

    @Test
    public void contextLoads() {
        System.out.println(bookDao.getBookById(1).toString());
        System.out.println(bookDao.getBookById(1).toString());
//        Book book = new Book(1, "三体", "刘慈欣", 29.8);

    }
}
