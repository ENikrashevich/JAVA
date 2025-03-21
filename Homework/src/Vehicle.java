public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("Engine has been started");
    }

    public void stopEngine(){
        System.out.println("Engine has been stopped");
    }

    public void Move(){
        System.out.println("Car is moving now");
    }

    public void Stop(){
        System.out.println("Car isn't moving now");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public int getYear(){
        return this.year;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }
}
