package tests;

import criterions.PriceCriterion;
import rental.Car;
import rental.Client;
import rental.Motorbike;
import rental.RentalAgency;
import rental.SuspiciousRentalAgency;
import rental.UnknownVehicleException;
import rental.Vehicle;

/** main to test for question  Q8 */
public class MainQ8 {

	public static void main(String[] args) throws IllegalStateException, UnknownVehicleException {
		RentalAgency agency = new RentalAgency();
		Vehicle v = new Vehicle("b","m",2016,100);
		agency.addVehicle(v);

		Client c1 = new Client("Tim Oleon", 40);
		float price = agency.rentVehicle(c1,v);
		Client c2 = new Client("Tim Oleon", 40);
		boolean b = agency.hasRentedAVehicle(c2);

		System.out.println("computed value for 'b'  : "+b+"  /!\\ this value should be true /!\\, is it the case ? If no why ? Correct it !");

		// Q10 Example
		SuspiciousRentalAgency SuspiciousAgency = new SuspiciousRentalAgency();
		Vehicle Fast = new Vehicle("Toyoto","Fast",2014,200f);
		Vehicle Faster = new Vehicle("Toyoto","Faster",2015,250f);
		Vehicle NoFast = new Vehicle("Toyoto","NoFast",2009,130f);
		Vehicle PileOfJunk = new Vehicle("Toyoto","PileOfJunk",1996,5f);
		SuspiciousAgency.addVehicle(Fast);
		SuspiciousAgency.addVehicle(Faster);
		SuspiciousAgency.addVehicle(NoFast);
		SuspiciousAgency.addVehicle(PileOfJunk);

		Client julius = new Client("ChaAaAarles", 22);
		Client christian = new Client("Christian", 22);
		Client hutte = new Client("Hutte", 22);

		price = SuspiciousAgency.rentVehicle(julius, Fast);
		if(price > Fast.getDailyPrice()) {System.out.println("WOW THAT'S A SCAM !!");}
		else {System.out.println("Nice rental agency, that's fair");}
		//Should return "WOW THAT'S A SCAM !!"

		// Q13 Car and Motorbike
		Motorbike moto = new Motorbike("Totoro", "UltraFastButRisky", 2019, 100f, 1);
		Car car = new Car("Horse", "Brown", 19, 100f, 1);	
		SuspiciousAgency.addVehicle(moto);
		SuspiciousAgency.addVehicle(car);
		
		SuspiciousAgency.rentVehicle(hutte, moto);
		SuspiciousAgency.rentVehicle(christian, car);
		System.out.println("They sucessfully rent a Moto and a Car");
		
		PriceCriterion pc = new PriceCriterion(100);
		SuspiciousAgency.displaySelection(pc);
	}
}
