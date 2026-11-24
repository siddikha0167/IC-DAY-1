public class singleHM {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Dog";
        d.breed="Golden Retriever";
        d.eat();
        d.bark();
    }
}
class Animal{
    String name="dog";
    public void eat(){
        System.out.println(name+" is eating");
    }
}
class Dog extends Animal{
    String breed;
    public void bark(){
        System.out.println(name+" the "+breed+" is barkking");
    }
}
