package home.blog.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import home.blog.entity.User;

public class DataBaseUtil {
    public static void main(String[] args) throws IOException {
        String resource = "conf.xml";
        InputStream is = DataBaseUtil.class.getClassLoader().getResourceAsStream(resource);
        // 构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        String statement = "home.blog.dao.mapping.userMapper.getUser";// 映射sql的标识字符串
        // 执行查询返回一个唯一user对象的sql
        User user = session.selectOne(statement, "admin");
        System.out.println(user.getIsDel());
        System.out.println(user.getPassword());
        System.out.println(user.getUserName());
        System.out.println(user.getCreateDate());
        System.out.println(user.getUpdateDate());
        session.close();
    }
}
