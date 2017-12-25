/**
 * Created by nibesh on 4/3/17.
 */
public abstract class Car extends Vehicle{
    protected boolean airCondition;

    @Override
    public String toString() {
        return "Car{" +
                "tyers=" + tyers +
                ", airCondition=" + airCondition +
                ", gears=" + gears +
                ", brakeType='" + brakeType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", hornStregth=" + hornStregth +
                '}';
    }
}
