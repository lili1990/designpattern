package factoryPattern;

import simpleFactory.Operation;

public class IFactoryImplement {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.CreateOperation();
		oper.numberA = 1;
		oper.numberB = 2;
		double result = oper.getResult();
		System.err.println(result);
	}

}
