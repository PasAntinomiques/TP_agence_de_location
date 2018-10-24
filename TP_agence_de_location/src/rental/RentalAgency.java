package rental;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RentalAgency {
	List<Vehicle> theVehicles;
	
	/**
	 * Constructor
	 */
	public RentalAgency() {}
	
	/** Add a vehicle from an RentalAgency
	 * @param v Vehicle added to the agency
	 */
	public void addVehicle(Vehicle v) {this.theVehicles.add(v);}
	
	/** Remove a vehicle from an RentalAgency
	 * @param v Vehicle removed to the agency
	 */
	public void removeVehicle(Vehicle v) {this.theVehicles.remove(v);}
	
	/** Get all the vehicles that verify a criterion 
	 * @param c Criterion that selected vehicles are verifying
	 * @return The selected vehicles
	 */
	public List<Vehicle> selectVehicles(Criterion c) {
		Iterator<Vehicle> itTheVehicles = theVehicles.iterator();
		List<Vehicle> selection = new LinkedList<Vehicle>(); 
		while(itTheVehicles.hasNext()) {
			Vehicle vehicle = itTheVehicles.next();
			if(c.isSatisfiedBy(vehicle)) {selection.add(vehicle);}
		}
		return selection;
	}
	
	/** Display the vehicles which verify the criterion c
	 * @param c the criterion which filters the vehicles
	 */
	public void displaySelection(Criterion c) {
		List<Vehicle> vehicles = selectVehicles(c);
		Iterator<Vehicle> itVehicles = vehicles.iterator();
		while(itVehicles.hasNext()) {
			System.out.println(itVehicles.next());
		}
	}
}
