package CauLacBoBongDa;

public class FootBallClub  {
    private String id,nameClub;
    private  long numberOfFan;
    FootBallClub(){}
    public String getId() {
        return id;
    }

    public void setId(String idClub) {
        this.id = idClub;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }

    public long getNumberOfFan() {
        return numberOfFan;
    }
    public void setNumberOfFan(long numberOfFan) {
        this.numberOfFan = numberOfFan;
    }
    @Override
    public String toString() {
        return " ";
    }
}
