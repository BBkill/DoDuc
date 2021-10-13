

public class StaffMan {
    private String fullName,Position;
    private long basicSalary, activeDay,id;
    StaffMan(long id, String fullName,long basicSalary, long activeDay,String Position) 
    {
        this.id=id;
        this.fullName=fullName;
        this.basicSalary=basicSalary;
        this.activeDay=activeDay;
        this.Position=Position;
    }
    private long sideMoney()
    {
        if(Position.equals("GD")) return 250000;
        if(Position.equals("PGD")) return 200000;
        if(Position.equals("TP")) return 180000;
        return 150000;
    }
    private long Salary()
    {
        return basicSalary*activeDay;
    }
    private long presentMoney()
    {
        if(activeDay>=25) return Salary()*20/100;
        if(activeDay>=22) return Salary()/10;
        return 0;
    }
    public long total()
    {
        return Salary()+presentMoney()+sideMoney();
    }
    @Override
    public String toString() {
        return "NV"+String.format("%02d", id)+" "+fullName+" "+Salary()+" "+presentMoney()+" "+sideMoney()+" "+total();
    }

}