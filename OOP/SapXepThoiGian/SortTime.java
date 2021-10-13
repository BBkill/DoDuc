public class SortTime implements Comparable<SortTime> {
    private long hours,minutes,seconds;
    SortTime(long hours,long minutes,long seconds)
    {
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    @Override
    public String toString() {
        return hours+" "+minutes+" "+seconds;
    }

    private long time()
    {
        return hours*3600+minutes*60+seconds;
    }


    @Override
    public int compareTo(SortTime o) {
        return (int)(time()-o.time());
    }
}
