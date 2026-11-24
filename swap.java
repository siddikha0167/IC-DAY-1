import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("After awapping:");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+ a +"\nb="+b);
    }
}
