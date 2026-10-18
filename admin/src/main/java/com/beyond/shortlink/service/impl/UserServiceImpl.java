package com.beyond.shortlink.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.beyond.shortlink.dao.entity.UserDO;
import com.beyond.shortlink.dao.mapper.UserMapper;
import com.beyond.shortlink.dto.resp.UserDTO;
import com.beyond.shortlink.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    private final UserMapper userMapper;

    public UserDTO getUserByUsername(String username) {

        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);

        //  extends ServiceImpl<UserMapper, UserDO> 里面的字段
        UserDO userDO = this.baseMapper.selectOne(queryWrapper);

        UserDTO resp = new UserDTO();

        BeanUtils.copyProperties(userDO, resp);

        return resp;


    }



}
