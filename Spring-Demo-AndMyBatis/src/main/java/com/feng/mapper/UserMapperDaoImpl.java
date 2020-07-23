package com.feng.mapper;

import com.feng.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperDaoImpl extends SqlSessionDaoSupport implements UserMapper  {
    UserMapper mapper ;
    public List<User> query() {
          mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.query();
    }

    public int insert(User user) {

        return mapper.insert(user);
    }

    public int delete(int id) {
        return  mapper.delete(id);
    }
}
