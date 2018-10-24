package rental;

/** A Motorbike is a vehicle with a cubic capacity
 * @author Quentin POSSAMAI
 *
 */
public class Motorbike extends Vehicle {
	
	private float cc;
	
	/** Construct a car like a vehicle but with seats
	 * @param brand
	 * @param model
	 * @param productionYear
	 * @param dailyRentalPrice
	 * @param cc
	 */
	public Motorbike(String brand, String model, int productionYear, float dailyRentalPrice,float cc) {
		super(brand, model, productionYear, dailyRentalPrice);
		this.cc= cc;
	}
	
	/** return the cubic capacity of a motor byke
	 * @return
	 */
	public float getCc() {return this.cc;}

	@Override
	public String toString() {
		return super.toString() + " Cubic capaciy : "+ this.cc;
	}
	
	

}
