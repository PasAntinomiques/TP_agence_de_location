package rental;

public class Motorbike extends Vehicle {
	
	private float cc;
	
	public Motorbike(String brand, String model, int productionYear, float dailyRentalPrice,float cc) {
		super(brand, model, productionYear, dailyRentalPrice);
		this.cc= cc;
	}
	
	public float getCc() {return this.cc;}

	@Override
	public String toString() {
		return super.toString() + " Cubic capaciy : "+ this.cc;
	}
	
	

}
