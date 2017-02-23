package springex;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by flying on 2017/2/11.
 */
public class HelloServiceTest {
    //psvm 生成main方法
    public static void main(String[] args) {
        //XXX
        //TODO
        //FIXME

    }

    @Test
    public void testSrc()
    {
        ApplicationContext applicationContext = null;
        applicationContext = new ClassPathXmlApplicationContext("springContext.xml");
        IHelloService helloService = (IHelloService) applicationContext.getBean("helloservice");
        helloService.sayHello();
    }
}

