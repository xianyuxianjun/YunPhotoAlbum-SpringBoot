package com.kejilouf3;

import com.kejilouf3.Mapper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YunPhotoAlbumSpringBootApplicationTests {
    @Autowired
    private userMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(userMapper.selectById(1));
    }

}
