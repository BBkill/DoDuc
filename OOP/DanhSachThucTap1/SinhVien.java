public class SinhVien implements Comparable<SinhVien> {
    private int Ordre;
    private String idCode, fullName, clss, email, nameOfCompany;
    SinhVien(int Ordre, String idCode, String fullName,String clss, String email,String nameOfCompany)
    {
        this.Ordre=Ordre;
        this.idCode=idCode;
        this.fullName=fullName;
        this.clss=clss;
        this.email=email;
        this.nameOfCompany=nameOfCompany;
    }
    public String getNameOfCompany() {
        return nameOfCompany;
    }
    @Override
    public String toString() {
        return Ordre+" "+idCode+" "+" "+fullName+" "+clss+" "+email+" "+nameOfCompany;
    }
    @Override
    public int compareTo(SinhVien o) {
        return fullName.compareTo(o.fullName);
    }
}
