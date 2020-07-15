package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2020/7/13.
 */
@Repository("alphaDaoHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
