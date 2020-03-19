package com.lhr13.first_springboot_lhr13.controller;

import com.lhr13.first_springboot_lhr13.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestForRedisController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/TRC")
    public void testForRedisController() {
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set("name", "三国演义");
        String name = ops1.get("name");
        System.out.println(name);

        ValueOperations<String, Book> ops2 = redisTemplate.opsForValue();
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("红楼梦");
        b1.setAuthor("曹雪芹");
        b1.setPrice((float) 29.8);
        ops2.set("b1", b1);
        System.out.println(b1.toString());
        Book book = ops2.get("b1");
        System.out.println(book.toString());



    }
}
