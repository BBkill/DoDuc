public class Salary {
    private String code, name;
    private long activeDay,basicSalary;
    Salary(String code,String name, long basicSalary,long activeDay)
    {
        this.code=code;
        this.name=name;
        this.basicSalary=basicSalary;
        this.activeDay=activeDay;
    }
    private long getMul()
    {

        int id = Integer.parseInt((String)code.subSequence(1, 3));
        char tmp = code.charAt(0);
        if(id>=1&&id<=3)
        {
            if(tmp=='A') return 10;
            if(tmp=='B') return 10;
            if(tmp=='C') return 9;
            if(tmp=='D') return 8;
        }
        if(id>=4&&id<=8)
        {
            if(tmp=='A') return 12;
            if(tmp=='B') return 11;
            if(tmp=='C') return 10;
            if(tmp=='D') return 9;
        }
        if(id>=9&&id<=15)
        {
            if(tmp=='A') return 14;
            if(tmp=='B') return 13;
            if(tmp=='C') return 12;
            if(tmp=='D') return 11;
        }
        if(id>=16)
        {
            if(tmp=='A') return 20;
            if(tmp=='B') return 16;
            if(tmp=='C') return 14;
            if(tmp=='D') return 13;
        }
        return 0;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public long getTotalSalary()
    {
        return getMul()*basicSalary*activeDay*1000;
    }
    public String getDeparment()
    {
        return code.substring(3);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}