public class SinhVien {
    private String name, ID, classes, email;
    SinhVien(String ID, String name,String classes, String email)
    {
        this.ID=ID;
        this.name=name;
        this.classes=classes;
        this.email=email;
    }
    public String getClasses() {
        return classes;
    }
    @Override
    public String toString() {
        return ID+" "+name+ " "+ classes+" "+email;
    }
   
}
