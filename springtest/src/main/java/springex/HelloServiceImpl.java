package springex;

/**
 * Created by flying on 2017/2/11.
 */
public class HelloServiceImpl implements IHelloService {
    private String name;

    @Override
    public void sayHello() {
        System.out.printf("Hello" + name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
