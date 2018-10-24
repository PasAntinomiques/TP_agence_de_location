package rental;

public class UnknownVehicleException extends Exception {
	public UnknownVehicleException() { super(); }
	public UnknownVehicleException(String message) { super(message); }
	public UnknownVehicleException(String message, Throwable cause) { super(message, cause); }
	public UnknownVehicleException(Throwable cause) { super(cause); }
}
