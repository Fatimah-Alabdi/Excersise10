public class Trucks implements Vehicle{
    private String type;
    private int weeks;

    public Trucks(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }
    public String getType() {
        return type;
    }
    public int getWeeks() {
        return weeks;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return weeks * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $500.0");
        System.out.println("Rental Cost: $" + calculateRentalCost());

    }
}
