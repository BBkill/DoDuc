import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
public class AgeOfPerson implements Comparable<AgeOfPerson> {
    private String name;
    private Date dayOfBirth;
    AgeOfPerson(String name, String dayOfBirth) throws DateTimeException, ParseException
    {
        this.name=name;
        this.dayOfBirth=new SimpleDateFormat("dd/MM/yyyy").parse(dayOfBirth);
    }
    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public int compareTo(AgeOfPerson o) {
        return dayOfBirth.compareTo(o.dayOfBirth);
    }
}