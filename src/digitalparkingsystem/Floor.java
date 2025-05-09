package digitalparkingsystem;

import java.util.ArrayList;
import java.util.List;

public class Floor {

	private int number;
	private List<ParkingSpot> spots;

	public Floor(int number) {
		this.number = number;
		this.spots = new ArrayList<>();
	}

	public void addParkingSpot(ParkingSpot spot) {
		spots.add(spot);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<ParkingSpot> getSpots() {
		return spots;
	}

	public void setSpots(List<ParkingSpot> spots) {
		this.spots = spots;
	}

	public List<ParkingSpot> viewAllFreeSpots() {

		List<ParkingSpot> freeSpots = new ArrayList<>();

		for (ParkingSpot ps : spots) {
			if (!ps.isOccupied())
				freeSpots.add(ps);
		}

		return freeSpots;
	}

	public List<ParkingSpot> viewFreeSpotByType(VehicleType type) {

		List<ParkingSpot> freeSpots = new ArrayList<>();

		for (ParkingSpot ps : spots) {
			if (!ps.isOccupied() && (ps.getType().equals(type)))
				freeSpots.add(ps);
		}
		return freeSpots;
	}

	public ParkingSpot getNearestParkingSpot(VehicleType type) {

		ParkingSpot nps = null;

		for (ParkingSpot ps : spots) {
			if (!ps.isOccupied() && (ps.getType().equals(type))) {
				nps = ps;
				break;
			}
		}
		return nps;
	}
}
