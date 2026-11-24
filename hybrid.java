public class hybrid {
    public static void main(String[] args) {
        Android a=new Android();
        iPhone i=new iPhone();
        i.turnOn("90%");
        i.makeCall(98.00);
        i.openAppStore();
        a.turnOn("89%");
        a.makeCall(89.00);
        a.openPlayStore();
    }
}
class Device{
    
    public void turnOn(String powerSource){
        System.out.println(powerSource);
        System.err.println("Power Source on");
    }
}
class Mobile extends Device{
    
    public void makeCall(double screenSize){
        System.out.println(screenSize);
    }
}
class Android extends Mobile{
    public void openPlayStore(){
        System.out.println("Play store is opend");
    }
}
class iPhone extends Mobile{
    public void openAppStore(){
        System.out.println("App store is oopend");
    }
}
