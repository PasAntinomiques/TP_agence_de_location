package rental;

public class SuspiciousRentalAgency extends RentalAgency {
	
	public SuspiciousRentalAgency() {super();}
	
	@Override
	public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
		UnknownVehicleException polo = new UnknownVehicleException();
		IllegalStateException billy = new IllegalStateException();
		if(!this.theVehicles.contains(v)) {throw polo;}
		else if(this.renting.containsKey(client) || this.renting.containsValue(v)) {throw billy;}
		else {
			this.renting.put(client, v);
			if(client.getAge() < 25) {return (float) (v.getDailyPrice()*1.1);}
			else {return v.getDailyPrice();}
			
		}
	}
}
