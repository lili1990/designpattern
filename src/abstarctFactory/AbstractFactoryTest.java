package abstarctFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		IFactory haierFactory = new HaierFactory();
		Fridge haierFridge = haierFactory.createFridge();
		TV haierTV = haierFactory.createTV();
		haierFridge.make();
		haierTV.make();

		IFactory hisenseFactory = new HisenseFactory();
		Fridge hisenseFridge = hisenseFactory.createFridge();
		TV hisenseTV = hisenseFactory.createTV();
		hisenseFridge.make();
		hisenseTV.make();
	}

}
