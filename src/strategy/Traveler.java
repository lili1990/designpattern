package strategy;

public class Traveler {

	// 持有一个具体策略的对象
	private TravelStrategy travelStrategy;

	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}

	public void trave() {
		this.travelStrategy.travel();
	}

}
