import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle>rentedVehicles=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);


        while (true) {
            System.out.println("Vehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
             int choice = scanner.nextInt();

switch (choice) {
case 1:
    System.out.print("Enter Car Model: ");
    String carModel = scanner.next();
    System.out.print("Enter Rental Days: ");
    int carDays = scanner.nextInt();
    Cars car = new Cars(carModel, carDays);
    rentedVehicles.add(car);
    car.displayDetails();
    break;
case 2:
    System.out.print("Enter Bike Brand: ");
    String bikeBrand = scanner.next();
    System.out.print("Enter Rental Hours: ");
    int bikeHours = scanner.nextInt();
    Bikes bike = new Bikes(bikeBrand, bikeHours);
    rentedVehicles.add(bike);
    bike.displayDetails();

    break;
    case 3:
        System.out.print("Enter Truck Type: ");
        String truckType = scanner.next();
        System.out.print("Enter Rental Weeks: ");
        int truckWeeks = scanner.nextInt();
        Trucks truck = new Trucks(truckType, truckWeeks);
        rentedVehicles.add(truck);
        truck.displayDetails();

    case 4:
        System.out.println("Rented Vehicles:");
        for (Vehicle vehicle : rentedVehicles) {
            vehicle.displayDetails();
            System.out.println();
        }
        break;
case 5:
    System.out.println("Thank you for using the Vehicle Rental System!");
    System.exit(5);
    break;
    default:
        System.out.println("Invalid choice. Please try again.");



}
        }

        }

    }
