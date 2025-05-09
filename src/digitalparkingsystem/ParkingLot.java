package digitalparkingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
	private String id;
	private String name;
	private List<Floor> floors;
	private Map<Integer, Ticket> activeTickets;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}

	public Map<Integer, Ticket> getActiveTickets() {
		return activeTickets;
	}

	public void setActiveTickets(Map<Integer, Ticket> activeTickets) {
		this.activeTickets = activeTickets;
	}

	public ParkingLot(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.floors = new ArrayList<>();
		this.activeTickets = new HashMap<>();
	}

	public void addfloor(Floor floor) {
		floors.add(floor);
	}

	public Ticket parkVehicle(Vehicle vehicle) {
		ParkingSpot nps = null;
		for (Floor floor : floors) {
			nps = floor.getNearestParkingSpot(vehicle.getType());
			if (nps != null) {
				break;
			}
		}
		if (nps == null) {
			System.out.println("no free parking slot better luck next time");
			return null;
		}
		Ticket ticket = new Ticket(vehicle, nps);

		nps.occupy();
		activeTickets.put(ticket.getId(), ticket);
		return ticket;
	}

	public Vehicle unparkVehicle(int ticketId) {

		Ticket ticket = activeTickets.get(ticketId);
		if (ticket == null) {
			System.out.println("invalid ticket id, Can't Unpark  The vehicle");
			return null;
		}

		ParkingSpot spot = ticket.getSpot();
		Vehicle vehicle = ticket.getVehicle();
		spot.free();
		activeTickets.remove(ticket).getId();
		return vehicle;
	}

	public void viewAllFreeParkingSpots() {
		for (Floor floor : floors) {
			List<ParkingSpot> freeSpots = floor.viewAllFreeSpots();
			for (ParkingSpot ps : freeSpots) {
				System.out.println("the" + ps.getType() + "Parking spot is free in" + floor.getNumber());
			}
		}
	}
}