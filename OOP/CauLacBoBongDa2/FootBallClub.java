package CauLacBoBongDa2;

public class FootBallClub implements  Comparable<FootBallClub>  {
    private String id,nameClub,idMatch;
    private  long numberOfFan,totalProfit;
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

    public void setTotalProfit(long totalProfit) {
        this.totalProfit = totalProfit;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    @Override
    public int compareTo(FootBallClub o) {
        if(totalProfit-o.totalProfit>0) return -1;
        if(totalProfit == o.totalProfit) return nameClub.compareTo(o.nameClub);
        return 1;
    }

    @Override
    public String toString() {
        return idMatch+" "+nameClub+" "+totalProfit;
    }
}
