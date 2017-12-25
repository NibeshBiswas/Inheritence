/**
 * Created by nibesh on 4/3/17.
 */
public class Hundyi extends Car {

    public String carName;

    public Hundyi(String vehicleName)
    {
        this.carName=vehicleName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    protected void drive(double tokilometer) {
        System.out.println("you have diven: "+tokilometer);
    }

    @Override
    public String toString() {
        return "Hundyi{" +
                "tyers=" + tyers +
                ", carName='" + carName + '\'' +
                ", airCondition=" + airCondition +
                ", gears=" + gears +
                ", brakeType='" + brakeType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", hornStregth=" + hornStregth +
                '}';
    }
}
