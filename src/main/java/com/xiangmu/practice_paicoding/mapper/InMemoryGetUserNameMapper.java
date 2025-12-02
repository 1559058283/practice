package com.xiangmu.practice_paicoding.mapper;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryGetUserNameMapper implements GetUserNameMapper {
    private final Map<String, String> articleAuthorMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void loadSampleData() {
        articleAuthorMap.put("1", "xiangmu");
        articleAuthorMap.put("2", "paicoding");
    }

    @Override
    public String getName(String articleId) {
        return articleAuthorMap.get(articleId);
    }
}
