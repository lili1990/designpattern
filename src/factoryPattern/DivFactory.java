package factoryPattern;

import simpleFactory.DivOperation;
import simpleFactory.Operation;

public class DivFactory implements IFactory {

	public Operation CreateOperation() {

		return new DivOperation();
	}

}
