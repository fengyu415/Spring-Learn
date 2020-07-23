import com.feng.pojo.Student;
import com.feng.pojo.User;
import com.feng.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public  void testStudent()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }


    @Test
    public  void testuser()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        UserT usert = applicationContext.getBean("usert", UserT.class);
        System.out.println(usert);
    }
}
