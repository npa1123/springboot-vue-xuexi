package com.hfxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfxt.mapper.UserMapper;
import com.hfxt.pojo.User;
import com.hfxt.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
