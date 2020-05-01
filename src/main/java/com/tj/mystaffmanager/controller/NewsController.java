package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.NewsEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.service.LoginService;
import com.tj.mystaffmanager.service.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class NewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 获取公告信息
     *
     * @return 公告list
     */
    @GetMapping("/api/HomePage/newsInfo")
    public List<NewsEntity> getNewsInfo() {
        return newsService.getAllNews();
    }
}
