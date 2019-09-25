package com.spring.boot.baseproject.service.impl;

import com.spring.boot.baseproject.dao.PartitionActivityMapper;
import com.spring.boot.baseproject.dao.PartitionsMapper;
import com.spring.boot.baseproject.dao.UserMapper;
import com.spring.boot.baseproject.entity.PartitionActivity;
import com.spring.boot.baseproject.entity.Partitions;
import com.spring.boot.baseproject.entity.User;
import com.spring.boot.baseproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PartitionsMapper partitionsMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void partitionsInsert() {
        // 构造一条测试数据
        Partitions partitions = new Partitions();
        partitions.setActivityCode("00001");
        partitions.setOrderCode("GG1001");

        // 插入数据
        partitionsMapper.insert(partitions);
    }

    @Override
    public void userInsert() {
        // 构造一条测试数据
        User user = new User();
        user.setId("00001");
        user.setName("GG1001");

        // 插入数据
        userMapper.insert(user);
    }

}
