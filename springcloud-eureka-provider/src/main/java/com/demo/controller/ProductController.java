package com.demo.controller;

import com.demo.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/provider")
    public List provider (@RequestParam int num){
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(new Product("banana",i));
        }
        return list;
    }
}
