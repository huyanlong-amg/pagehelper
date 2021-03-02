package com.huyl.pagehelper.service.impl;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huyl.pagehelper.entity.QueryPage;
import com.huyl.pagehelper.entity.User;
import com.huyl.pagehelper.mapper.PageMapper;
import com.huyl.pagehelper.responce.WebResponce;
import com.huyl.pagehelper.service.PageService;
import com.huyl.pagehelper.util.PagehelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author huyanlong
 * @Date 2021/3/2 22:59
 */
@Service
public class PageServiceImpl implements PageService {

    @Autowired
    PageMapper pageMapper;

    @Override
    public WebResponce getUserList(QueryPage page) {
        Page<User> users = PageHelper.<User>startPage(page.getPageNum(), page.getPageSize()).doSelectPage(() -> pageMapper.selectUsers());
        return WebResponce.success(PagehelperUtil.getDataTable(users));
    }
}
