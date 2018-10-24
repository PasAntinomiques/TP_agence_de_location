package criterions;

import rental.Criterion;
import rental.Vehicle;

public class BrandCriterion implements Criterion {

	private String brand;
	
	public BrandCriterion(String brand) {
		this.brand = brand;
	}
	
	@Override
	public boolean isSatisfiedBy(Vehicle v) {
		return v.getBrand() == this.brand;
	}

}
