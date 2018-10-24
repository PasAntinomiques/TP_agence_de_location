package criterions;

import rental.Criterion;
import rental.Vehicle;

/** Criterion satisfied if price is below maxPrice
 * @author Jules
 *
 */
public class PriceCriterion implements Criterion{
	private float maxPrice;
	
	public PriceCriterion(float price) {
		this.maxPrice = price;
	}
	
	@Override
	public boolean isSatisfiedBy(Vehicle v) {

		return v.getDailyPrice() <= this.maxPrice;
	}
	
	
}
