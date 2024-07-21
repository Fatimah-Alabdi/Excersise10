public class Bikes implements Vehicle {
    private String brand;
    private int hours;

    public Bikes(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }
    public String getBrand() {
        return brand;
    }
    public int getHours() {
        return hours;
    }


    @Override
    public double calculateRentalCost() {
        return hours * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: $10.0");
        System.out.println("Rental Cost: $" + calculateRentalCost());

    }
}
