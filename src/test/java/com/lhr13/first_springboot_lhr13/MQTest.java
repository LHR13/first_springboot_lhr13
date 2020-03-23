package com.lhr13.first_springboot_lhr13;

import com.lhr13.first_springboot_lhr13.bean.Book;
import com.lhr13.first_springboot_lhr13.controller.ProducerController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MQTest {

    @Autowired
    private ProducerController producerController;

    @Test
    public void MQTest() {
        for (int i = 0; i < 5; i++) {
            producerController.setQueue(new Book(i, "sg", "lgz", 29.8));
        }
    }
}
