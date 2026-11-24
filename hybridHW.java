public class hybridHW {
    public static void main(String[] args) {
        Professor p=new Professor();
        AdminOfficer a=new AdminOfficer();
        p.memberId=1001;
        p.checkIn();
        p.attendMeeting("CSE");
        p.conductLecture("ATCD");
        a.memberId=1002;
        a.checkIn();
        a.attendMeeting("Principal room");
        a.processFiles("Admin cabin");
        
    }
}
class UniversityMember{
    int memberId;
    public void checkIn(){
        System.out.println(memberId+"\nMember checked in");
    }
}
class Staff extends UniversityMember{
    public void attendMeeting(String department){
        System.err.println("Member attentd the meeting in "+department);
    }
}
class Professor extends Staff{
    public void conductLecture(String subject){
        System.out.println("Professor Subject :"+subject);
    }
}
class AdminOfficer extends Staff{
    public void processFiles(String officeRoom){
        System.out.println("Member processed files in "+officeRoom);
    }
}
