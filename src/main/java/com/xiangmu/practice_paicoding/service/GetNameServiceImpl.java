package com.xiangmu.practice_paicoding.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xiangmu.practice_paicoding.api.ApiResponse;
import com.xiangmu.practice_paicoding.mapper.GetUserNameMapper;
import com.xiangmu.practice_paicoding.model.Username;
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
        Username username = getUserNameMapper.selectOne(
                new LambdaQueryWrapper<Username>().eq(Username::getArticleId, articleId)
        );
        if (username == null) {
            return new ApiResponse("404", "article not found", null);
        }
        return new ApiResponse("200", "success", username.getUsername());
    }
}
