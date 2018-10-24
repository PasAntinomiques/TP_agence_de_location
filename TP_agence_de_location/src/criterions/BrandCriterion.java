package criterions;

import rental.Criterion;
import rental.Vehicle;

/** Criterion is satisfied if vehicule brand equals this.brand
 * @author Jules
 *
 */
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
