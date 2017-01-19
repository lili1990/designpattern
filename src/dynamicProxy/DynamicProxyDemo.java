package dynamicProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sdlili on 17-1-19.
 */
public class DynamicProxyDemo {


    public static void main(String[] args) {
        ProxyService proxyService = new ProxyServiceImpl();
        System.out.println(proxyService.getClass());

        DynamicProxyHandler handler = new DynamicProxyHandler(proxyService);

        ProxyService proxy =  (ProxyService)handler.getProxy();
        System.out.println(proxy.getClass());
        proxy.printContent();

    }



}
