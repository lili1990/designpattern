package factoryPattern;

import simpleFactory.AddOperation;
import simpleFactory.Operation;

public class AddFactory implements IFactory {
	public Operation CreateOperation() {
		return new AddOperation();
	}

}
