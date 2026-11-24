import java.util.Scanner;
public class simpleCalculator {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operator:");
        char c=sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            
        }
    }
    
}
