package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 访问数据库的接口
 */
public interface UserMapper {

    @Insert("insert into USER(name,phone,createTime) values(#{name},#{phone},now())")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    int insert(User user);

    @Select("select * from user")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    List<User> getAll();   


}
