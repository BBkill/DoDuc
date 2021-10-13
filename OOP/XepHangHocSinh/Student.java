public class Student implements Comparable<Student> {
    private String fullName;
    private float mark;
    private int idCode,order;
    Student(int idCode,String fullName,float mark)
    {
        this.idCode=idCode;
        this.fullName=fullName;
        this.mark=mark;
    }
    private String getRank()
    {
        if(mark<5) return "Yeu";
        if(mark>=5&&mark<7) return "Trung Binh";
        if(mark>=7&&mark<9) return "Kha";
        return "Gioi"; 
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public int getOrder() {
        return order;
    }
    public float getMark() {
        return mark;
    }
    public int getIdCode() {
        return idCode;
    }
    @Override
    public String toString() {
        return "HS"+String.format("%02d", idCode)+" "+fullName+" "+ String.format("%.1f", mark) +" "+getRank()+" ";
    }
    @Override
    public int compareTo(Student o) {
        if(mark>o.mark) return -1;
        return 1;
    }


}