package com.huyl.pagehelper.service;

import com.huyl.pagehelper.entity.QueryPage;
import com.huyl.pagehelper.responce.WebResponce;

/**
 * @Author huyanlong
 * @Date 2021/3/2 22:59
 */
public interface PageService {
    WebResponce getUserList(QueryPage page);
}
