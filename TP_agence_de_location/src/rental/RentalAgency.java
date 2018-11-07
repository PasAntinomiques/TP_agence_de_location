package rental;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import criterions.Criterion;

public class RentalAgency {
	List<Vehicle> theVehicles;
	Map<Client, Vehicle> renting;
	
	/**
	 * Constructor
	 */
	public RentalAgency() {
		this.theVehicles = new LinkedList<Vehicle>();
		this.renting = new HashMap<Client, Vehicle>();
	}
	
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
	
	/** Manage the rent when a client rent a vehicle
	 * @param client The client who wants to rent
	 * @param v The vehicle to rent
	 * @return The DailyPrice of the vehicle v 
	 * @throws UnknownVehicleException Raised when the vehicle is not possessed by the RentalAgency
	 * @throws IllegalStateException Raised when client is already renting a vehicle
	 */
	public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
		UnknownVehicleException polo = new UnknownVehicleException();
		IllegalStateException billy = new IllegalStateException();
		if(!this.theVehicles.contains(v)) {throw polo;}
		else if(this.renting.containsKey(client) || this.renting.containsValue(v)) {throw billy;}
		else {
			this.renting.put(client, v);
			return v.getDailyPrice();
		}
	}
	
	/** Check if the client is renting a vehicle
	 * @param client client
	 * @return true if client is renting a vehicle
	 */
	public boolean hasRentedAVehicle(Client client) {return this.renting.containsKey(client);}
	
	/** Check if a vehicle is currently rented
	 * @param v vehicle
	 * @return true if a vehicle is rented
	 */
	public boolean isRented(Vehicle v) {return this.renting.containsValue(v);}
	
	/** Handle when a client returns a vehicle to the RentalAgency
	 * @param client client
	 */
	public void returnVehicle(Client client) {this.renting.remove(client);}
	
	public Collection<Vehicle> allRentedVehicles(){return this.renting.values();}
}