package com.kejilouf3.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kejilouf3.Pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper extends BaseMapper<User> {
}
