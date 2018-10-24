package criterions;

import java.util.Iterator;
import java.util.LinkedList;

import rental.Vehicle;

/** Class that combines several criterions, it is satisfied if all the criterions in it are
 * satisfied
 * @author Quentin POSSAMAI
 *
 */
public class InterCriterion implements Criterion {
	
	LinkedList<Criterion> criterions;
	
	/** Generate a criterion that satisfies several criterion at the same time
	 * 
	 */
	public InterCriterion(){;}
	
	/** Add a criterion to the InterCriterion
	 * @param c The criterion to add
	 */
	public void addCriterion(Criterion c){criterions.add(c);}
	
	@Override
	public boolean isSatisfiedBy(Vehicle v) {
		boolean answer = true;
		Iterator<Criterion> itCriterions = criterions.iterator();
		while(itCriterions.hasNext()) {
			if(!itCriterions.next().isSatisfiedBy(v)) {
				answer = false;
			}
		}
		return answer;
	}

}
