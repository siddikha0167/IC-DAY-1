public class encap1 {
    public static void main(String[] args) {
        student s=new student();
        BankAccount b=new BankAccount();
        s.setName("Ammu");
        s.setRollNumber("24HR1A05F2");
        s.getName();
        s.getRollNumber();
        b.setbalance(10.0000);
        b.getbalance();
        b.deposit(20.0);
        b.withdraw(15.0);
        b.getbalance();
    }
}
class student{
    private String name;
    private String rollNumber;
    public void getName(){
        System.out.println(name);
    }
    public void setName(String n){
        name=n;
    }
    public void getRollNumber(){
        System.out.println(rollNumber);
    }
    public void setRollNumber(String r){
        rollNumber=r;
    }
}
class BankAccount{
    private String accountHolder;
    public void getAccountHolder(){
        System.out.println(accountHolder);
    }
    public void setAccountHolder(String a){
        accountHolder=a;
    }
    private double balance;
    public void getbalance(){
        if(balance>0){
            System.out.println(balance);
        }
        else{
            System.out.println("Invalid Balance");
        }
    }
    public void setbalance(double b){
        balance=b;     
    }
    public void deposit(double amont){
        balance=balance+amont;
        System.err.println(amont+" deposited");
    }
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println(amount+" Withdrawn");
    }
}
