public class Teachers  {
    private String idCode,fullName;
    private long basicSalary;
    Teachers(String idCode, String fullName, long basicSalary)
    {
        this.idCode=idCode;
        this.fullName=fullName;
        this.basicSalary=basicSalary;
    }
    public String Position()
    {
        return idCode.substring(0, 2);
    }
    private long SideSalary()
    {
        
        if(Position().equals("HT")) return 2000000;
        if(Position().equals("HP")) return 900000;
        return 500000;
    }
    private long RankingSalary()
    {
        return Long.parseLong(idCode.substring(2, 4));
    }
    private long Salary()
    {
        
        return SideSalary()+RankingSalary()*basicSalary;
    }
    
    @Override
    public String toString() {
        return idCode+" "+fullName+" "+RankingSalary()+" "+SideSalary()+" "+Salary();
    }
    
}