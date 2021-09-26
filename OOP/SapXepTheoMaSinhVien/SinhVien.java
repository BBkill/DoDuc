public class SinhVien implements Comparable<SinhVien> {
    private String name, ID, classes, email;
    SinhVien(String ID, String name,String classes, String email)
    {
        this.ID=ID;
        this.name=name;
        this.classes=classes;
        this.email=email;
    }
    @Override
    public String toString() {
        return ID+" "+name+ " "+ classes+" "+email;
    }
    @Override
    public int compareTo(SinhVien o) {
        return ID.compareTo(o.ID);
    }
}
