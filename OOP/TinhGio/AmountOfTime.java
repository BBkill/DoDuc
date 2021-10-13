import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeoutException;

public class AmountOfTime implements Comparable<AmountOfTime> {
    private String idPlayer,fullName;
    private Date startTime,finishTime;
    AmountOfTime(String idPlayer,String fullName,String startTime,String finishTime) throws TimeoutException, ParseException
    {
        this.idPlayer=idPlayer;
        this.fullName=fullName;
        this.startTime = new SimpleDateFormat("HH:mm").parse(startTime);
        this.finishTime=new SimpleDateFormat("HH:mm").parse(finishTime);
    }
    private long timeOut()
    {
        return (finishTime.getTime()-startTime.getTime())/1000;
        // trả về giây
    }
    private long getHour()
    {
        return timeOut()/3600;
    }
    private long getMinute()
    {
        return timeOut()/60-getHour()*60;
    }
    private String toRightName()
    {
        String ss[]=fullName.trim().toLowerCase().split("\\s+");
        String ans="";
        for (String tmp : ss) {
            String s="";
            for(int i=0;i<tmp.length();i++)
            {
                if(i==0) s=s+(tmp.charAt(i)+"").toUpperCase();
                else s=s+(tmp.charAt(i)+"").toLowerCase();
            }
            ans=ans+s+" ";
        }
        return ans;
    }
    @Override
    public int compareTo(AmountOfTime o) {
        return -(int)(timeOut()-o.timeOut());
    }
    @Override
    public String toString() {
        return idPlayer+" "+toRightName()+" "+getHour()+" gio "+getMinute()+" phut";
    }
}
