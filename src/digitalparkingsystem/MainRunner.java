package digitalparkingsystem;

public class MainRunner {
	public static void main(String[] args) {
		ParkingSpot bs1 = new BikeSpot();
		ParkingSpot bs2 = new BikeSpot();
		ParkingSpot bs3 = new BikeSpot();

		ParkingSpot cs1 = new CarSpot();
		ParkingSpot cs2 = new CarSpot();
		ParkingSpot cs3 = new CarSpot();

		ParkingSpot ts1 = new TruckSpot();
		ParkingSpot ts2 = new TruckSpot();
		ParkingSpot ts3 = new TruckSpot();

		Floor f0 = new Floor(0);
		f0.addParkingSpot(ts1);
		f0.addParkingSpot(ts2);
		f0.addParkingSpot(ts3);

		Floor f1 = new Floor(1);
		f1.addParkingSpot(cs1);
		f1.addParkingSpot(cs2);
		f1.addParkingSpot(cs3);

		Floor f2 = new Floor(2);
		f2.addParkingSpot(bs1);
		f2.addParkingSpot(bs2);
		f2.addParkingSpot(bs3);

		ParkingLot pl = new ParkingLot("manyata Tech Park, Parking Lot");
		pl.addfloor(f0);
		pl.addfloor(f1);
		pl.addfloor(f2);
		

		Vehicle b1 = new Bike("AP 39 hj 1112");
		
		Ticket ticket = pl.parkVehicle(b1);
		System.out.println("your vehicle has been parked successfullt, and your Ticket id is : "+ticket.getId());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		pl.viewAllFreeParkingSpots();
		
		

		
	}
}
