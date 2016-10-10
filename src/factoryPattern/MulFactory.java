package factoryPattern;

import simpleFactory.MultiplyOperation;
import simpleFactory.Operation;

public class MulFactory implements IFactory {

	public Operation CreateOperation() {
		return new MultiplyOperation();
	}

}
