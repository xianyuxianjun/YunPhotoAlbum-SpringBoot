package com.kejilouf3.Pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class User {
    @TableId(type = IdType.AUTO)
    private String username;
    private String password;
    private String name;
}
