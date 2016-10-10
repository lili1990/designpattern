package strategy;

public class TravelStrategyTest {

	public static void main(String[] args) {
		Traveler traveler = new Traveler();
		// 选择并创建需要使用的策略对象
		TravelStrategy travelStrategy = new TrainTravelStrategy();
		traveler.setTravelStrategy(travelStrategy);
		traveler.trave();
		travelStrategy = new AirTravelStrategy();
		traveler.setTravelStrategy(travelStrategy);
		traveler.trave();
		travelStrategy = new CarTravelStrategy();
		traveler.setTravelStrategy(travelStrategy);
		traveler.trave();

	}

}
