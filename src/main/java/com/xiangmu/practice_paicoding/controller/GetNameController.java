package com.xiangmu.practice_paicoding.controller;
import com.xiangmu.practice_paicoding.api.ApiResponse;
import com.xiangmu.practice_paicoding.service.GetNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetNameController {
    @Autowired
    private GetNameService getnameservice;

    @RequestMapping("/articleId")
    public ApiResponse getName(@RequestParam String articleId) {
        return getnameservice.getName(articleId);
    }
}
