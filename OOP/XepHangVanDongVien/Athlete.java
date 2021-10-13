
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;

public class Athlete implements Comparable<Athlete> {
    private String name;
    private Date dayOfBirth, startTime,finishTime,present;
    private int id;
    Athlete(int id,String name, String dayOfBirth,String startTime,String finishTime) throws DateTimeException, ParseException
    {
        this.id=id;
        this.name=name;
        this.dayOfBirth = new SimpleDateFormat("dd/MM/yy").parse(dayOfBirth);
        this.startTime = new SimpleDateFormat("HH:mm:ss").parse(startTime);
        this.finishTime = new SimpleDateFormat("HH:mm:ss").parse(finishTime);
        this.present = new SimpleDateFormat("dd/MM/yy").parse("22/09/2021");
    }
    
    public int getId() {
        return id;
    }
    private String getAmountOfTime(long bonus)
    {
        long totalSecond=(finishTime.getTime()-startTime.getTime())/1000-bonus; //getTime()  trả về số miliseconds--> chia 1000 để được seconds
        long hours= totalSecond/3600;
        long minutes = (totalSecond-hours*60)/60;
        long seconds = totalSecond-hours*3600-minutes*60;
        return String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds);
    }
    private long getAge()
    {
        return (present.getTime()-dayOfBirth.getTime())/1000/365/24/3600;
    }
    private long bonusTime()
    {
        if(getAge()<18) return 0;
        if(getAge()<25) return 1;
        if(getAge()<32) return 2;
        return 3;
    }
    private String toStringBonusTime()
    {
        return "00:00:"+String.format("%02d", bonusTime());
    }
    public long totalTime()
    {
        return (finishTime.getTime()-startTime.getTime())/1000-bonusTime();
    }
    @Override
    public String toString() {
        return "VDV"+String.format("%02d", id)+" "+name+" "+getAmountOfTime(0)+" "+toStringBonusTime()+" "+getAmountOfTime(bonusTime())+" ";
    }
    @Override
    public int compareTo(Athlete o) {
        if(totalTime()-o.totalTime()>0) return 1;
        return -1;
    }

}