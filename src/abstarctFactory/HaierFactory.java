package abstarctFactory;

public class HaierFactory implements IFactory {
	public Fridge createFridge() {
		return new HaierFridge();
	}

	public TV createTV() {
		return new HaierTV();
	}
}
