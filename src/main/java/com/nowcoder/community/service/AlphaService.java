package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2020/7/13.
 */
@Service
public class AlphaService  {
    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化service");
    }

    //注解的意思是，初始化在构造器后调用
    @PostConstruct
    public void init(){
        System.out.println("初始化Service");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁Service");
    }

    public String find(){
       return alphaDao.select();
    }
}
