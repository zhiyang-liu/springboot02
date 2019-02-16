package com.lianjia.springboot002;

import com.lianjia.springboot002.dao.ReadingListRepository;
import com.lianjia.springboot002.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot002ApplicationTests {
    @Autowired
    private ReadingListRepository readingListRepository;

    @Test
    public void contextLoads() {
        Book book = new Book();
        book.setReader("liuzhiyang");
        book.setTitle("abcdefgh");
        readingListRepository.save(book);
        List<Book> readingList = readingListRepository.findByReader("liuzhiyang");
        for(Book b:readingList){
            assertEquals("abcdefgh",b.getTitle());
        }
    }

}
