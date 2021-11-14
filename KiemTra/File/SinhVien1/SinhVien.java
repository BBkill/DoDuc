package SinhVien1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String name, classes, id;
    private Date dob;
    private float gpa;
    SinhVien(int order, String name,String classes,String dob,float gpa) throws ParseException
    {
        this.id = "B20DCCN" + String.format("%03d",order);
        this.name = name;
        this.classes = classes;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.gpa = gpa;
    }

    private String chuanhoaTen() {
        String s = "", ss = "";
        s = " " + name.trim().replaceAll(" +", " ").toLowerCase();
        char[] a = s.toCharArray();
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] == ' ')
                ss = ss + ((a[i] + "").toUpperCase());
            else
                ss = ss + (a[i] + "");
        }
        return ss;
    }
    @Override
    public String toString() {
        return id+" "+chuanhoaTen() + " "+classes +" "+ new SimpleDateFormat("dd/MM/yyyy").format(dob)+" "+String.format("%.2f", gpa);
    }
}
