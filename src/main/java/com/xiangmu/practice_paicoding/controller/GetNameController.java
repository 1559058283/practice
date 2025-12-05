package com.xiangmu.practice_paicoding.controller;

import com.xiangmu.practice_paicoding.api.ApiResponse;
import com.xiangmu.practice_paicoding.service.GetNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class GetNameController {
    private final GetNameService getNameService;

    @Autowired
    public GetNameController(GetNameService getNameService) {
        this.getNameService = getNameService;
    }

    @GetMapping("/author")
    public ApiResponse getName(@RequestParam String articleId) {
        return getNameService.getName(articleId);
    }
}
