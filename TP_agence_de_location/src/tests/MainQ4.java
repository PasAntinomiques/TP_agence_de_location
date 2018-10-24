package tests;

import criterions.BrandCriterion;
import criterions.Criterion;
import criterions.InterCriterion;
import criterions.PriceCriterion;
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
		bobs.addVehicle(new Vehicle("Lada","JustACar",1989,2f));
		bobs.addVehicle(new Vehicle("Lada","JustACar",1987,2f));
		bobs.addVehicle(new Vehicle("Lada","JustACar",1984,2.2f));
		bobs.addVehicle(new Vehicle("Lada","JustACar",1989,2f));
		
		Criterion c1 = new PriceCriterion(200);
		Criterion c2 = new BrandCriterion("Toyoto");
		InterCriterion c3 = new InterCriterion();
		c3.addCriterion(c1);
		c3.addCriterion(c2);
		
		bobs.displaySelection(c3);
	}

}
