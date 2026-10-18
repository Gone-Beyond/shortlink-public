package com.beyond.shortlink.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beyond.shortlink.dao.entity.UserDO;
import com.beyond.shortlink.dto.resp.UserDTO;

public interface UserService extends IService<UserDO> {
    UserDTO getUserByUsername(String username);
}
