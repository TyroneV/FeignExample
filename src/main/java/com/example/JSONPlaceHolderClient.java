package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://caliber2-mock.revaturelabs.com/mock/category/")

public interface JSONPlaceHolderClient {
    @RequestMapping(method = RequestMethod.GET, value = "/category")
    List<MyCategory> getPosts();

//    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
//    MyCategory getPostById(@PathVariable("postId") Long postId);
}
