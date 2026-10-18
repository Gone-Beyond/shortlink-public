package com.beyond.shortlink;

import com.beyond.shortlink.dto.resp.UserDTO;
import com.beyond.shortlink.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ShortLinkAdminApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void getUserTest() {
            UserDTO resp = userService.getUserByUsername("test");
            System.out.println(resp);
    }


}
