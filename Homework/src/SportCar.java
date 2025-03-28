class SportCar extends Car{

    private int topSpeed;
    private int percentFuel;
    private String transmissionType;

    public SportCar(String brand, String model, int year,
                    String fuelType, double engineSize, int range,
                    int topSpeed, int percentFuel, String transmissionType) {
        super(brand, model, year, fuelType, engineSize, range);
        this.topSpeed = topSpeed;
        this.percentFuel = percentFuel;
        this.transmissionType = transmissionType;
    }

    public int refuel(String fuelType, int countFuel){
        if(this.getFuelType().equals(fuelType))
            this.percentFuel += countFuel;
        return this.percentFuel;
    }

    public void useNitro() {
        System.out.println("Nitro activated! Speed boosted!");
        percentFuel -= 15;
    }

    public void shiftGear() {
        System.out.println("Shifting gear with " + transmissionType + " transmission");
    }

    public void drift() {
        System.out.println("Drifting the sports car");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Top speed: " + this.getTopSpeed() + ", Percent fuel: " + this.getPercentFuel()
                + "%, Transmission type:" + this.getTransmissionType());
    }

    public int getTopSpeed(){
        return this.topSpeed;
    }

    public int getPercentFuel(){
        return this.percentFuel;
    }

    public String getTransmissionType(){
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
