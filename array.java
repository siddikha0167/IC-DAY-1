import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array values");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max) {
                max=arr[i];
            }
            sum=sum+arr[i];
        }
        double average=sum/n;

        System.out.println("Min in array:"+min);
        System.out.println("Max inn array:"+max);
        System.out.println("Average of array:"+average);
    }
}
