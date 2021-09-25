import java.util.*;
import java.text.*;
public class Students {
    private String name;
    private Date doB;
    private float firstM;
    private float secondM;
    private float thirstM;


    Students(String name,String doB,float firstM,float secondM,float thirstM) throws ParseException
    {
        this.name=name;
        this.doB = new SimpleDateFormat("dd/MM/yyyy").parse(doB);
        this.firstM=firstM;
        this.secondM=secondM;
        this.thirstM=thirstM;
    }
    private float totalM()
    {
        return firstM+secondM+thirstM; 
    }
    @Override
    public String toString() {
        return name+" "+new SimpleDateFormat("dd/MM/yyyy").format(doB) +" "+String.format("%.1f", totalM());
    }
}
