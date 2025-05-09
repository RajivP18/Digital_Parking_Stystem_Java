# 🚗 Digital Parking System

A modular, object-oriented **Java application** that simulates a digital parking lot capable of managing bikes, cars, and trucks across multiple floors. This system provides vehicle parking/unparking, ticket generation, and real-time spot availability — designed for extendability and ease of understanding.

---

## 🧩 Features

- ✅ **Multi-level parking structure**
- 🚘 **Vehicle-type based spot allocation** (Bike, Car, Truck)
- 🎟️ **Auto-generated parking tickets** with time and rate
- 📅 **Real-time entry/exit tracking**
- 📊 **View available parking spots by type and floor**
- 🛠️ Fully **OOP-compliant architecture** for easy scalability

---

## 🛠️ Technologies Used

- **Java** (Core OOP principles)
- **UUID** for unique ticket and spot IDs
- **Java Collections** (List, Map)
- **Java Time API** for timestamps

---

## 🏗️ Class Overview

| Class             | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `Vehicle`         | Abstract base for all vehicles with subclasses: `Bike`, `Car`, `Truck`     |
| `ParkingSpot`     | Abstract spot class with types: `BikeSpot`, `CarSpot`, `TruckSpot`         |
| `Ticket`          | Represents a parking ticket including vehicle, spot, timestamp, and fare   |
| `Floor`           | Represents a single parking floor managing multiple parking spots          |
| `ParkingLot`      | Manages all floors, parking logic, ticketing, and spot availability        |
| `MainRunner`      | Driver class to simulate parking operations                                 |

---

## 📁 Folder Structure

```
digitalparkingsystem/
│
├── MainRunner.java
├── ParkingLot.java
├── Floor.java
├── Ticket.java
├── Vehicle.java
├── Bike.java | Car.java | Truck.java
├── ParkingSpot.java
├── BikeSpot.java | CarSpot.java | TruckSpot.java
├── VehicleType.java
```

---

## 🚀 Getting Started

### 📦 Prerequisites
- Java JDK 8 or higher
- IDE (IntelliJ, Eclipse, VS Code, etc.)

### ▶️ How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/digital-parking-system.git
   cd digital-parking-system
   ```

2. **Open the project** in your favorite Java IDE.

3. **Run `MainRunner.java`** to simulate parking and unparking operations.

---

## 🔍 Sample Flow

```java
Vehicle bike = new Bike("AP 39 HJ 1112");
Ticket ticket = parkingLot.parkVehicle(bike);

System.out.println("Ticket ID: " + ticket.getId());

parkingLot.viewAllFreeParkingSpots();

Vehicle vehicle = parkingLot.unparkVehicle(ticket.getId());
```

---

## 📈 Future Improvements

- ⏱️ Hourly rate calculation based on parking duration
- 🌐 REST API or Web interface using Spring Boot + React
- 💳 Payment gateway integration
- 🧠 Smart parking allocation logic
- 📱 Mobile app integration

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!  
Feel free to [open an issue](https://github.com/yourusername/digital-parking-system/issues) or submit a pull request.

---

## 💬 Contact

Developed by **Rajiv Pillalamarri**  
For queries, email at: `rajivpillalamarri@gmail.com`  
