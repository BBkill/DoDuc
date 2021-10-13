public class StaffMan {
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
    public String getPosition() {
        return Position;
    }
    private int AdvanceSalary()
    {
        float tmp=(SideSalary()+basicSalary*activeDay)*2/3 ;
        if(tmp<25000) return (int)Math.round(tmp/1000)*1000;
        return 25000;
    }
    private int Remain()
    {
        return basicSalary*activeDay-AdvanceSalary()+SideSalary();
    }
    
    @Override
    public String toString() {
        
        return "NV"+String.format("%02d", idCode)+" "+fullName+" "+SideSalary()+" "+basicSalary*activeDay+" "+AdvanceSalary()+" "+Remain();
    }
}
