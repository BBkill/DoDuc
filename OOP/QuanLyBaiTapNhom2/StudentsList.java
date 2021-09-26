public class StudentsList implements Comparable<StudentsList>{
    private String idCode, fullName, phoneNUmber;
    private int Order;
    StudentsList(String idCode,String fullName,String phoneNumber,int Order)
    {
        this.idCode=idCode;
        this.fullName=fullName;
        this.phoneNUmber=phoneNumber;
        this.Order=Order;  
    }
    public int getOrder() {
        return Order;
    }
    @Override
    public String toString() {
        return idCode+" "+fullName+" "+phoneNUmber+" "+Order+" ";
    }
    @Override
    public int compareTo(StudentsList o) {
        return idCode.compareTo(o.idCode);
    }
}