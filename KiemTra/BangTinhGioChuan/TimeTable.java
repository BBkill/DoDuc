public class TimeTable {
    private String idCode, name;
    TimeTable(String idCode,String name)
    {
        this.idCode=idCode;
        this.name=name;
    }
    public String getIdCode() {
        return idCode;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
