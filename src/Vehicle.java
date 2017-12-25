/**
 * Created by nibesh on 4/3/17.
 */
public abstract class Vehicle {
    protected int tyers;
    protected int gears;
    protected String brakeType;
    protected String vehicleName;
    protected double hornStregth;

    protected abstract void drive(double tokilometer);

    public void displayVechicle(){
        System.out.println("The name of the vehicle"+vehicleName);
    }

    public int getTyers() {
        return tyers;
    }

    public void setTyers(int tyers) {
        this.tyers = tyers;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getHornStregth() {
        return hornStregth;
    }

    public void setHornStregth(double hornStregth) {
        this.hornStregth = hornStregth;
    }
}
