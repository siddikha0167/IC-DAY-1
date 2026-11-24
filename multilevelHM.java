public class multilevelHM {
    public static void main(String[] args) {
        FixedDepositAccount f=new FixedDepositAccount();
        f.accountNumber=1800100164;
        f.interestRate=20.0;
        f.lockInYers=5;
        f.showAccount();
        f.showSavingsDetails();
        f.showFDDetails();
    }
}
class Account{
    int accountNumber;
    public void showAccount(){
        System.out.println("AC Num: "+accountNumber);
    }
}
class SavingAccount extends Account{
    double interestRate;
    public void showSavingsDetails(){
        System.out.println(" For the fixed amount the InterestRate is "+interestRate);
    }
}
class FixedDepositAccount extends SavingAccount{
    int lockInYers;
    public void showFDDetails(){
        System.out.println("FD Account locked upto "+lockInYers+" Years");
    }
}
