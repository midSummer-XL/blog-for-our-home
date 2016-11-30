package home.blog.dao;

import org.apache.ibatis.session.SqlSession;

import home.blog.entity.User;
import home.blog.util.DataBaseUtil;

public class UserDao {

    public User getUserByName(String userName) {
        SqlSession session = DataBaseUtil.getSqlSessionFactory().openSession();
        try {
            String statement = "home.blog.dao.mapping.userMapper.getUser";
            User user = session.selectOne(statement, userName);
            return user;
        } finally {
            session.close();
        }
    }
}
