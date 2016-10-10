package factoryPattern;

import simpleFactory.Operation;

public interface IFactory {
	Operation CreateOperation();
}
