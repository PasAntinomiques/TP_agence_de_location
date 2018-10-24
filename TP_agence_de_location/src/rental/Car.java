package rental;

public class Car extends Vehicle {
	private int seats;

	public Car(String brand, String model, int productionYear, float dailyRentalPrice,int seats) {
		super(brand, model, productionYear, dailyRentalPrice);
		this.seats = seats;
	}
	
	public int getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return super.toString() + " Seats : " + this.seats;
	}
	
	

}
