package tests;

import java.util.*;

import rental.Client;
import rental.RentalAgency;
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
    }
}
