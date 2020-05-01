package com.tj.mystaffmanager.service;

import com.tj.mystaffmanager.entity.NewsEntity;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.service
 * @NAME: NewsService
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:34
 **/
public interface NewsService {
    List<NewsEntity> getAllNews();
}
