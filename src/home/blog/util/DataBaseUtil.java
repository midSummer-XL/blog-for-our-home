package home.blog.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataBaseUtil {

    private static String resource = "conf.xml";

    private static InputStream is = DataBaseUtil.class.getClassLoader().getResourceAsStream(resource);

    private static final SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

    public static SqlSessionFactory getSqlSessionFactory() {
        return sessionFactory;
    }
}
