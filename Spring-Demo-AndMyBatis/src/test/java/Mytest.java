import com.feng.mapper.UserMapper;
import com.feng.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mytest {

    @Test
    public void testqueryUser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.query();
        for (User user: userList){
            System.out.println(user);
        }

        sqlSession.close();
        System.out.println("");
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserMapper mapper =  context.getBean("userMapper",UserMapper.class);
        List<User> user = mapper.query();
        System.out.println(user);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserMapper mapper =  context.getBean("userDaoMapper",UserMapper.class);
        List<User> user = mapper.query();
        System.out.println(user);
    }

    @Test
    public void testtrans(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserMapper mapper =  context.getBean("userDaoMapper",UserMapper.class);
        List<User> user = mapper.query();
        User xinzde1 = new User(11, "xinzde", "12345");
        int xinzde = mapper.insert(xinzde1);

        int xinzde11 = mapper.delete(9);
        System.out.println(user);
        List<User> user1= mapper.query();
        System.out.println(user1);

    }

    @Test
    public void testtranss(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserMapper mapper =  context.getBean("userDaoMapper",UserMapper.class);
        List<User> user = mapper.query();
      /*  User xinzde1 = new User(13, "xinzde", "12345");
        int xinzde = mapper.insert(xinzde1);

        int xinzde11 = mapper.delete(9);
*/
        List<User> user1= mapper.query();
        System.out.println(user);
      /*  System.out.println(user1);*/
    }
}
