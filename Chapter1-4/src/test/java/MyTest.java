import static org.junit.Assert.*;

import com.waston.autowired.config.MainConfig;
import com.waston.autowired.pojo.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//使用JUnit测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MainConfig.class})
public class MyTest {

    //使用@Autowired自动装载Person的bean
    @Autowired
    private Person p;

    @Test
    public void personNotBeNull(){
        assertNotNull(p);
        Assert.assertEquals(p.getProfession(), "Student");
    }
}