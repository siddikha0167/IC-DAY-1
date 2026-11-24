public class hyrarchiHM {
    public static void main(String[] args) {
        Developer d=new Developer();
        Tester t=new Tester();
        d.name="Ammu";
        d.baseSalary=30000;
        d.programmingLanguage="JAVA";
        t.testingTool="Postman";
        t.name="Kanna";
        t.baseSalary=20000;
        d.displayBasicInfo();
        d.writeCode();
        t.displayBasicInfo();
        t.runTests();
    }
}
class Employee{
    String name;
    double baseSalary;
    public void displayBasicInfo(){
        System.out.println("Name:"+name+"\nBase Salary:"+baseSalary);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    public void writeCode(){
        System.out.println("Employee write code in "+programmingLanguage+" language");
    }
}
class Tester extends Employee{
    String testingTool;
    public void runTests(){
        System.out.println("Employee use the "+testingTool+" to runtests");
    }
}
