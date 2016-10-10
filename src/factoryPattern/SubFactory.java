package factoryPattern;

import simpleFactory.Operation;
import simpleFactory.SubOperation;

public class SubFactory implements IFactory {
	public Operation CreateOperation() {
		return new SubOperation();
	}
}
