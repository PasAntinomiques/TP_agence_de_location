package rental;

/** A car is a vehicle with seats
 * @author Quentin POSSAMAI
 *
 */
public class Car extends Vehicle {
	private int seats;

	/** Construct a car like a vehicle but with seats
	 * @param brand brand name
	 * @param model model name
	 * @param productionYear production year
	 * @param dailyRentalPrice daily rental price
	 * @param seats number of seats
	 */
	public Car(String brand, String model, int productionYear, float dailyRentalPrice,int seats) {
		super(brand, model, productionYear, dailyRentalPrice);
		this.seats = seats;
	}
	
	/** Return the seats number of a car
	 * @return the numer of seats
	 */
	public int getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return super.toString() + " Seats : " + this.seats;
	}
	
	

}
