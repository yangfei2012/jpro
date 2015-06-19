package org.fei.test;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user LIMIT 5 ")
    List<User> fetchAll();
}
