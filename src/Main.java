/**
 * Created by nibesh on 4/3/17.
 */
public class Main {
    public static void main(String[] args) {
        BMW myBMW1=new BMW("\nMy BMW1 is Aswome");
        myBMW1.displayVechicle();
        myBMW1.drive(100);
        myBMW1.setBrakeType("Hydrolic");
        myBMW1.setGears(5);
        myBMW1.setHornStregth(100.5);
        myBMW1.setTyers(6);

        System.out.println(myBMW1.toString());


        Hundyi myHundyi=new Hundyi("\n My hundayi is aswame");
//        myHundyi.displayVechicle();
        myHundyi.drive(200);

        System.out.println(myHundyi.getCarName());

        Hundyi myHundyi2=new Hundyi("\n My hundayi is aswame");
        myHundyi2.displayVechicle();
        myHundyi2.drive(300);
    }
}
