package com.xiangmu.practice_paicoding.service;

import com.xiangmu.practice_paicoding.api.ApiResponse;
import com.xiangmu.practice_paicoding.mapper.GetUserNameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
class getNameServiceImpl implements GetNameService {

//    @Autowired
//    private GetUserNameMapper getUserNameMapper;
    @Override
    public ApiResponse getName(String articleId) {
//        getUserNameMapper
        return new ApiResponse("200", "success", "xiangmu");
    }
}
