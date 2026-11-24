public class encapsulation {
    public static void main(String[] args) {
        animal a=new animal();
        a.getter();
        a.setter("meow");
        a.getter();
    }
}
class animal{
    private String sound="bow";
    public void getter(){
        System.out.println(sound);
    }
    public void setter(String d){
        sound=d;
    }
}
