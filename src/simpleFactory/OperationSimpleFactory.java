package simpleFactory;

public class OperationSimpleFactory {

	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new AddOperation();
			break;
		case "= ":
			oper = new SubOperation();
			break;
		case " *":
			oper = new MultiplyOperation();
			break;
		case "/ ":
			oper = new DivOperation();
			break;
		}
		return oper;
	}

}
