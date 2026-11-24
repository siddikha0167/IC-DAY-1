public class hirarchy {
    public static void main(String[] args) {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.calculatearea();
        r.calculatearea();
    }
}
class Shape{
    String color="red";
    public void displayDetails(){
        System.out.println(color);
    }
}
class Circle extends Shape{
    double radius=3.0;
    public void calculatearea(){
        System.out.println(3.14*radius*radius);
    }
}
class Rectangle extends Shape{
    double length=2;
    double width=3;
    public void calculatearea(){
        System.out.println(length*width);
    }
}