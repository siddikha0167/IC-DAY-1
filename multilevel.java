public class multilevel {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.displayEmployee();
        m.displayManager();
        m.displayPerson();
    }
}
class Person{
    String name="Ammu";
    public void displayPerson(){
        System.out.println(name);
    }
}
class Employee extends Person{
    int empId=121;
    public void displayEmployee(){
        System.out.println(empId);
    }
}
class Manager extends Employee{
    String dept="HR";
    public void displayManager(){
        System.out.println(dept);
    }
}
