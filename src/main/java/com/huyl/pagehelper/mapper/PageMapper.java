package com.huyl.pagehelper.mapper;

import com.huyl.pagehelper.entity.QueryPage;
import com.huyl.pagehelper.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author huyanlong
 * @Date 2021/3/2 22:46
 */
@Repository
public interface PageMapper {

    List<User> selectUsers();
}
