public class Student {
    private String idCode, fullName, Standard, Email;
    Student(String idCode, String fullName,String Standard,String Email)
    {
        this.idCode=idCode;
        this.fullName=fullName;
        this.Standard=Standard;
        this.Email=Email;
    }
    public String getSubject()
    {
        return (idCode.charAt(5)+"")+(idCode.charAt(6)+"");
    }
    public Boolean CheckCLC()
    {
        if(idCode.indexOf(3)=='E'&&(idCode.indexOf(5)=='C'||idCode.indexOf(5)=='A')) return false;
        return true;
    }
    @Override
    public String toString() {
        return idCode+" "+fullName+" "+Standard+" "+Email;
    }

}
