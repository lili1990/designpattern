package proxyPattern;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("----");
	}

	public static void main(String[] args) {
		RealObect real = new RealObect();
		consumer(real);
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class[] { Interface.class }, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}
