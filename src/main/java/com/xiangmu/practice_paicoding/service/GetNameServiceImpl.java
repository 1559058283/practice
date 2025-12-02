package com.xiangmu.practice_paicoding.service;

import com.xiangmu.practice_paicoding.api.ApiResponse;
import com.xiangmu.practice_paicoding.mapper.GetUserNameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetNameServiceImpl implements GetNameService {
    private final GetUserNameMapper getUserNameMapper;

    @Autowired
    public GetNameServiceImpl(GetUserNameMapper getUserNameMapper) {
        this.getUserNameMapper = getUserNameMapper;
    }

    @Override
    public ApiResponse getName(String articleId) {
        String author = getUserNameMapper.getName(articleId);
        if (author == null) {
            return new ApiResponse("404", "article not found", null);
        }
        return new ApiResponse("200", "success", author);
    }
}
