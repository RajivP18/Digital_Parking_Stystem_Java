package digitalparkingsystem;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
	
	private int id;
	private Vehicle vehicle;
	private ParkingSpot spot;
	private LocalDateTime entryDateTime;
	private LocalDateTime exitDateTime;
	private double amount;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}



	public ParkingSpot getSpot() {
		return spot;
	}



	public void setSpot(ParkingSpot spot) {
		this.spot = spot;
	}



	public LocalDateTime getEntryDateTime() {
		return entryDateTime;
	}



	public void setEntryDateTime(LocalDateTime entryDateTime) {
		this.entryDateTime = entryDateTime;
	}



	public LocalDateTime getExitDateTime() {
		return exitDateTime;
	}



	public void setExitDateTime(LocalDateTime exitDateTime) {
		this.exitDateTime = exitDateTime;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public Ticket(Vehicle vehicle, ParkingSpot spot) {
		
		this.id = Math.abs(UUID.randomUUID().toString().hashCode());
		
		this.vehicle = vehicle;
		
		this.spot = spot;
		this.entryDateTime = LocalDateTime.now();
		if(vehicle.getType().equals(VehicleType.BIKE)) {
			this.amount = 10;
		}
		if(vehicle.getType().equals(VehicleType.CAR)) {
			this.amount = 20;
		}
		if(vehicle.getType().equals(VehicleType.TRUCK)) {
			this.amount = 30;
		}
	}
}