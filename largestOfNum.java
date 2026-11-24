import java.util.Scanner;

public class largestOfNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b && a>c){
            System.out.println(a+" largest Number");
        }
        else if(b>a && b>c){
            System.out.println(b+" largest Number");
        }
        else{
            System.out.println(c+" largest Number");
        }
    }
    
}
