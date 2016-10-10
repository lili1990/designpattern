package proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理
public class DynamicProxyHandler implements InvocationHandler {

	private Interface proxied;

	public DynamicProxyHandler(Interface proxied) {
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
		System.out.println("----------------proxy:" + proxy.getClass() + "---method:" + method + "----args:" + args);
		if (args != null) {
			for (Object arg : args)
				System.out.println("    " + arg);
		}
		return method.invoke(proxied, args);
	}

}
