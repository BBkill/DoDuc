public class StaffMan implements Comparable<StaffMan> {
    private String fullName, Position;
    private int basicSalary, activeDay, idCode;
    StaffMan(int idCode, String fullName,String Position,int basicSalary, int activeDay)
    {
        this.idCode=idCode;
        this.fullName=fullName;
        this.Position=Position;
        this.basicSalary=basicSalary;
        this.activeDay=activeDay;
    }
    private int SideSalary()
    {
        if(Position.equals("GD")) return 500;
        else if(Position.equals("PGD")) return 400;
        else if(Position.equals("TP")) return 300;
        else if(Position.equals("KT")) return 250;
        return 100;
    }
    
    private int AdvanceSalary()
    {
        float tmp=(SideSalary()+InCome())*2/3 ;
        if(tmp<25000) return (int)Math.round(tmp/1000)*1000;
        return 25000;
    }
    private int Remain()
    {
        return InCome()-AdvanceSalary()+SideSalary();
    }
    private int InCome()
    {
        return basicSalary*activeDay;
    }
    @Override
    public String toString() {
        
        return "NV"+String.format("%02d", idCode)+" "+fullName+" "+SideSalary()+" "+InCome()+" "+AdvanceSalary()+" "+Remain();
    }
    @Override
    public int compareTo(StaffMan o) {
        if(InCome()+SideSalary()>o.InCome()+o.SideSalary()) return -1;
        else if(InCome()+SideSalary()<o.InCome()+o.SideSalary()) return 1;
        return idCode-o.idCode;
    }
}
