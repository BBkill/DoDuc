
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String code, name;
    private int numberofStudents;
    DoanhNghiep(String code, String name,int numberofStudents)
    {
        this.code=code;
        this.name=name;
        this.numberofStudents=numberofStudents;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getNumberofStudents() {
        return numberofStudents;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberofStudents(int numberofStudents) {
        this.numberofStudents = numberofStudents;
    }
    @Override
    public String toString() {
        return code.toUpperCase()+" "+name.replace("\\s\\s", " ").trim()+" "+numberofStudents;

    }
    @Override
    public int compareTo(DoanhNghiep o) {
        if(numberofStudents-o.numberofStudents>0) return -1;
        else if(numberofStudents-o.numberofStudents<0) return 1;
        else
        {
            if(code.compareTo(o.code)>0) return 1;
            else return -1;
        }
    }
}