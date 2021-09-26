public class GiangVien {
    private String name, deparment;
    private int stt;
    GiangVien(int stt, String name, String deparment)
    {
        this.stt=stt;
        this.name=name;
        this.deparment=deparment;
    }
    public static String codeDeparment(String string)
    {
        String tmp[]=string.trim().split("\\s+") ;
        String code="";
        for(String s : tmp)
        {
            code=code+(s.charAt(0)+"").toUpperCase();
        }
        return code;
    }
    public String getDeparment() {
        return codeDeparment(deparment);
    }
    @Override
    public String toString() {
        return "GV"+String.format("%02d", stt)+" "+name+" "+codeDeparment(deparment);
    }
    
}
