import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enteer a number to check Armstrong");
        int n=s.nextInt();
        int sum=0;
        int original=n;
        while (n>0) {
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(original==sum){
            System.out.println("Given number is Armstrong");
        }else{
             System.out.println("Given number is NOT Armstrong");
        }
    }
}
