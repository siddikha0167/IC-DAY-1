import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check palindrome");
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while (n>0) {
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        System.out.println(reverse);
        if (original==reverse) {
            System.out.println("Given number is Palindrome");
        }else{
            System.out.println("Given number is NOT Palindrome");
        }
    }
}
