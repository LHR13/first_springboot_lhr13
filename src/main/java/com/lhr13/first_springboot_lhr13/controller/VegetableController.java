package com.lhr13.first_springboot_lhr13.controller;

import com.lhr13.first_springboot_lhr13.bean.Vegetable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class VegetableController {
    @GetMapping("/veget")
    public Vegetable veget() {
        Vegetable vegetable = new Vegetable();
        vegetable.setName("tomato");
        vegetable.setPrice(6.5);
        vegetable.setMarket("西关农贸市场");
        vegetable.setProductionDate(new Date());
        return vegetable;
    }
}
