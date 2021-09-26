public class GiangVien implements Comparable<GiangVien> {
    private String name, deparment;
    private int stt;
    GiangVien(int stt, String name, String deparment)
    {
        this.stt=stt;
        this.name=name;
        this.deparment=deparment;
    }
    private String codeDeparment()
    {
        String tmp[]=deparment.trim().split("\\s+") ;
        String code="";
        for(String s : tmp)
        {
            code=code+(s.charAt(0)+"").toUpperCase();
        }
        return code;
    }
    private String firstName()
    {
        String tmp[]=name.trim().split("\\s+");
        return tmp[tmp.length-1];
    }
    @Override
    public String toString() {
        return "GV"+String.format("%02d", stt)+" "+name+" "+codeDeparment();
    }
    @Override
    public int compareTo(GiangVien o) {
        if(firstName().equals(o.firstName()))
            return codeDeparment().compareTo(o.codeDeparment());
        return firstName().compareTo(o.firstName());
    }
}
