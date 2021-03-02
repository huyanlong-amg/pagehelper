package com.huyl.pagehelper.controller;

import com.huyl.pagehelper.entity.QueryPage;
import com.huyl.pagehelper.responce.WebResponce;
import com.huyl.pagehelper.service.PageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huyanlong
 * @Date 2021/3/2 22:45
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("page")
public class PageController {

    @Autowired
    private final PageService pageService;

    @GetMapping("user")
    public WebResponce getUserList(QueryPage page) {
        return pageService.getUserList(page);
    }
}
