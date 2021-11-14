package QuanLiBanHang1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Consumer {
    private String cid,cname,gender,address;
    private Date dob;
    Consumer(int i, String name,String gender,String dob,String address) throws ParseException
    {
        this.cid = "KH"+String.format("%03d", i);
        this.cname = name;
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return cid+" "+cname+" "+address+" ";
    }
}
