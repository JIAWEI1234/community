package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2020/7/13.
 */
@Repository
@Primary
public class AlphDaoMybatisImpl implements AlphaDao{

    @Override
    public String select() {
        return "Mybatis";
    }
}
