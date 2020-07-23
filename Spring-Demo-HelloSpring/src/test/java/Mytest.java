import com.feng.pojo.Hello;
import com.feng.pojo.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public  void testHelloSpring()
    {
       /* Hello hello = new Hello();
        hello.setUserName("11");
        hello.showHello();*/
       /*通过默认无参数构造进行注入*/
       ApplicationContext Context = new ClassPathXmlApplicationContext("bean.xml");
       /*加载文件就注入了*/
        Hello hello = Context.getBean("hello", Hello.class);
        hello.showHello();

    }
    @Test
    public  void testUser()
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        user.showUserName();
    }
}
