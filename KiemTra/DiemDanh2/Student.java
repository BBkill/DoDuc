

public  class Student {
    private String idCode,name,classroom;

    Student(String idCode,String name,String classroom)
    {
        this.idCode=idCode;
        this.name=name;
        this.classroom=classroom;
    }
    public String getIdCode() {
        return idCode;
    }
    public String getClassroom() {
        return classroom;
    }
    @Override
    public String toString() {
        return idCode+" "+name+" "+classroom+" ";
    }
}