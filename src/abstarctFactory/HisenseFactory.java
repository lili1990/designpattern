package abstarctFactory;

public class HisenseFactory implements IFactory {
	public Fridge createFridge() {
		return new HisenseFridge();
	}

	public TV createTV() {
		return new HisenseTV();
	}
}
