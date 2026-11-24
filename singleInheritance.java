public class singleInheritance {
    public static void main(String[] args) {
        Car c=new Car();
        c.displayDetails();
        c.horn();
    }
}
class Vehicle{
     String brand="BMW";
    public void horn(){
        System.out.println("BEEP! Beep!");
    }
}
class Car extends Vehicle{
    String modelName="BMWXct6";

    public void displayDetails(){
        System.err.println(modelName);
        System.out.println(brand);
    }
}
/*class child2 extends parent{

}
class grandchild extends chlid{

}*/

