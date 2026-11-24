public class shape {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.setlength(20);
        r.setwidth(10);
        r.getlength();
        r.getwidth();
        r.calculatePerimeter();
        r.calculatearea();
    }
}
class rectangle{
    private double length;
    private double width;
    public void getlength(){
        System.out.println(length);
    }
    public void setlength(double l){
        length=l;
    }
    public void getwidth(){
        System.out.println(width);
    }
    public void setwidth(double w){
        width=w;
    }
    public void calculatearea(){
        System.out.println(length*width);
    }
    public void calculatePerimeter(){
        System.out.println(2*(length+width));
    }
}
