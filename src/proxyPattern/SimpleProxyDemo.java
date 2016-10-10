package proxyPattern;

public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("----");
	}

	public static void main(String[] args) {
		consumer(new RealObect());
		consumer(new SimpleProxy(new RealObect()));
	}

}
