package proxyPattern;

public class RealObect implements Interface {

	@Override
	public void doSomething() {
		System.out.println("------doSomething----");

	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("------somethingElse----" + arg);

	}

}
