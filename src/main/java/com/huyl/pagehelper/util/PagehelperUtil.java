package com.huyl.pagehelper.util;

import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author huyanlong
 * @Date 2021/2/20 23:53
 */
public class PagehelperUtil {

    public static Map<String, Object> getDataTable(Page<?> page) {
        Map<String, Object> data = new HashMap<>(2, 1);
        data.put("rows", page.getResult());
        data.put("total", page.getTotal());
        data.put("page", page.getPages());
        return data;
    }
}
