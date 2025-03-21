class Car extends Vehicle{
    private String fuelType;
    private double engineSize;
    private int range;

    public Car(String brand, String model, int year, String fuelType, double engineSize, int range){
        super(brand, model, year);
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.range = range;
    }

    public void honk() {
        System.out.println("Honking the horn");
    }

    public void park() {
        System.out.println("Parking the car");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel type: " + this.getFuelType() + ", Engine size: " + this.getEngineSize() + ", Range: " + this.getRange() + "km");
    }

    public int getRange(){
        return this.range;
    }

    public double getEngineSize(){
        return this.engineSize;
    }

    public String getFuelType(){
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
