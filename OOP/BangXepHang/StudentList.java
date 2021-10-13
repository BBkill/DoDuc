

public class StudentList implements Comparable<StudentList> {
    private String name, number;
    private String[] Number=new String[2];
    StudentList(String name,String number)
    {
        this.name=name;
        this.number=number;
        String[] tmp= number.split("\\s+");
        Number[0] =tmp[0];
        Number[1] = tmp[1];
    }
    private int getAC()
    {
        return Integer.parseInt(Number[0]);
    }
    private int getSunmit()
    {
        return Integer.parseInt(Number[1]);
    }
    @Override
    public int compareTo(StudentList o) {
        if(getAC()>o.getAC()) return -1;
        if(getAC()==o.getAC()) return getSunmit()-o.getSunmit();
        return 11;
    }
    @Override
    public String toString() {
        return name+" "+getAC()+" "+getSunmit();
    }
    
}