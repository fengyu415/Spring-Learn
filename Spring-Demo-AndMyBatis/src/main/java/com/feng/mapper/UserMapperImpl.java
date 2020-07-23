package com.feng.mapper;

import com.feng.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    //sqlSession不用我们自己创建了，Spring来管理
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> query() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.query();
    }

    public int insert(User user) {
        return 0;
    }

    public int delete(int id) {
        return 0;
    }
}
