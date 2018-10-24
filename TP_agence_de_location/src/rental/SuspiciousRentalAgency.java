package rental;

/** A particular agency which increase the price of rent by 10% when the client is below 25 years old
 * @author Quentin POSSAMAI
 *
 */
public class SuspiciousRentalAgency extends RentalAgency {

	public SuspiciousRentalAgency() {super();}

	@Override
	public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
		float price = super.rentVehicle(client, v);
		return client.getAge() < 25 ? (float)(price*1.1) : price;
	}
}
