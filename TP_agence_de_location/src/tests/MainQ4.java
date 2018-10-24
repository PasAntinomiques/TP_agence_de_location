package tests;

import criterions.PriceCriterion;
import rental.Criterion;
import rental.RentalAgency;
import rental.Vehicle;

public class MainQ4 {

	public static void main(String[] args) {
		RentalAgency bobs = new RentalAgency();
		
		bobs.addVehicle(new Vehicle("Toyoto","Fast",2014,200f));
		bobs.addVehicle(new Vehicle("Toyoto","Faster",2015,250f));
		bobs.addVehicle(new Vehicle("Toyoto","NoFast",2009,130f));
		bobs.addVehicle(new Vehicle("Toyoto","PileOfJunk",1996,5f));
		bobs.addVehicle(new Vehicle("Citron","Fat",2017,200f));
		bobs.addVehicle(new Vehicle("Citron","BigFat",2015,220f));
		bobs.addVehicle(new Vehicle("Lada","Car",1989,2f));
		
		Criterion c = new PriceCriterion(100);
		
		bobs.displaySelection(c);
	}

}
