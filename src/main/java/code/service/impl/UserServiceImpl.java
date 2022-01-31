package code.service.impl;

import code.mapper.UserMapper;
import code.pojo.User;
import code.service.UserService;
import code.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserServiceImpl implements UserService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<User> selectAll() {
        //2. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //3. 获取BrandMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //4. 调用方法
        List<User> users = mapper.selectAll();

        //5. 释放资源
        sqlSession.close();

        return users;
    }
}
