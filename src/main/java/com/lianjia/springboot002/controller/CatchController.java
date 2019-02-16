package com.lianjia.springboot002.controller;

import com.lianjia.springboot002.dao.CatchDao;
import com.lianjia.springboot002.entity.Book;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.Map;

@RestController
public class CatchController {
    @Autowired
    private CatchDao catchDao;

    @RequestMapping(value = "/index")
    public String testCatch(){
        /*Book book = catchDao.getBook("liuzhiyang", "springboot 实战");
        return book.getAuthor()+" "+book.getTitle();*/

        Map<String, Integer> map = catchDao.getMap();
        return map.get("a").toString();
    }
}
