package dynamicProxy;

/**
 * Created by sdlili on 17-1-19.
 */
public class ProxyServiceImpl implements ProxyService {
    @Override
    public void printContent() {
        System.out.println("I am the target object's method!");
    }
}
