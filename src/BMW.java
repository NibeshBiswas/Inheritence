/**
 * Created by nibesh on 4/3/17.
 */
public class BMW extends Car{
    public BMW (String vehicleName){
        this.vehicleName=vehicleName;
    }
    @Override
    public void drive(double tokilometer) {
        System.out.println("Your BMW has driven: "+tokilometer);
    }
}
