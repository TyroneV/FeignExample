package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
public class MyController {

    @Autowired
    JSONPlaceHolderClient json;

    @GetMapping
    public List<MyCategory> getCategories(){
        return json.getPosts();
    }
}
