

public class Cars implements Vehicle {
    private String model;
    private int days;
    public Cars(String model, int days) {
        this.model = model;
        this.days = days;
    }
    public String getModel() {
        return model;
    }
    public int getDays() {
        return days;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days * 50;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Daily Rental Rate: $50.0");
        System.out.println("Rental Cost: $" + calculateRentalCost());

    }
}
