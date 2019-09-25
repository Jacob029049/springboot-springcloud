package com.spring.boot.baseproject;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.boot.baseproject.dao.PartitionsMapper;
import com.spring.boot.baseproject.entity.Partitions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BaseprojectApplication.class)
@Transactional
@Rollback
public class BaseprojectApplicationTests {

    @Autowired
    private PartitionsMapper partitionsMapper;

    @Test
    public void testSelectAll(){
        List<Partitions> partitionsList = partitionsMapper.selectAll();
        for (Partitions partitions : partitionsList){
            System.out.println(partitions.getActivityCode());
        }
    }

    @Test
    public void testPage(){
        PageHelper.startPage(0,2);
        Example example = new Example(Partitions.class);
        PageInfo<Partitions> pageInfo = new PageInfo<>(partitionsMapper.selectByExample(example));

        List<Partitions> partitionsList = pageInfo.getList();
        for(Partitions partitions :partitionsList){
            System.out.println(partitions.getActivityCode());
        }
    }

}
