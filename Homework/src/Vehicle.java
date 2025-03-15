public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public int getYear(){
        System.out.println(year + " - is my age");
        return this.year;
    }

    public String getBrand(){
        System.out.println(brand + " - is my brand");
        return this.brand;
    }

    public String getModel(){
        System.out.println(model + " - is my model");
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

class Car extends Vehicle{
    private String fuelType;
    private bool engine;
    private double engineSize;
    private int range;

    public void startEngine(){
    this.engine = True;
    }

    public void offEngine(){
    this.engine = false;
    }

    public int getRange(){
        System.out.println("Max range is " + range);
        return this.range;
    }

    public double getEngineSize(){
        System.out.println("Engine size is " + engineSize);
        return this.engineSize;
    }

    public String getFuelType(){
        System.out.println("Fuel type is " + fuelType);
        return this.fuelType;
    }

    public void setRange(int range){
        this.range = range;
    }

    public void setEngineSize(double engineSize){
        this.engineSize = engineSize;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
}

class sportCar extends Car{
    private int topSpeed;
    private int percentFuel;
    private String transmissionType;

    public int getTopSpeed(){
        System.out.println("Max speed is " + topSpeed);
        return this.topSpeed;
    }

    public int getPercentFuel(){
        System.out.println("There's still fuel left " + percentFuel);
        return this.percentFuel;
    }

    public String getTransmissionType(){
        System.out.println("Transmission type is " + transmissionType);
        return this.transmissionType;
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    public void setPercentFuel(int percentFuel){
        this.percentFuel = percentFuel;
    }

    public void setTransmissionType(String transmissionType){
        this.transmissionType = transmissionType;
    }
}