import com.yaorange.webservice.WSInterface;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassNameTest
 * @Descripiotn //TODO
 * @Author luokun
 * @Date 2020/8/20 18:05
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {
    @Autowired
    private WSInterface wsInterface;

    @org.junit.Test
    public void get() {
        String name = wsInterface.getState("13795957429");
        System.out.println(name);
    }
}
