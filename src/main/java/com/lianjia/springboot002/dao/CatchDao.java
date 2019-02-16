package com.lianjia.springboot002.dao;

import com.lianjia.springboot002.entity.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CatchDao {

    @Cacheable(value = "books")
    public Book getBook(String reader, String title){
        Book book = new Book();
        book.setReader(reader);
        book.setTitle(title);
        System.out.println("测试缓存！！！");
        return book;
    }

    //@Cacheable(value = "map")
    public Map<String, Integer> getMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        System.out.println("测试缓存！！！");
        return map;
    }
}
