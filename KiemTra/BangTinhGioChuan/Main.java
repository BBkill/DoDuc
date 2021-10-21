import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int numbOfsubject = Integer.parseInt(input.nextLine());
        Map<String,String> map1 = new HashMap<>();
        for(int i=0;i<numbOfsubject;i++)
        {
            map1.put(input.next().trim(), input.nextLine().trim());
        }
        int numbOfTeachers = Integer.parseInt(input.nextLine());
        ArrayList<TimeTable> list = new ArrayList<>();
        for(int i=0;i<numbOfTeachers;i++)
        {
            TimeTable teacher  = new TimeTable(input.next().trim(), input.nextLine().trim());
            list.add(teacher);
        }
        int numbOfClass = Integer.parseInt(input.nextLine());
        Map<String,Float> map2 =new HashMap<>();
        for(int i=0;i<numbOfClass;i++)
        {
            String id = input.next();
            String idclass= input.next();
            float times= input.nextFloat();
            if(map2.containsKey(id))
            {
                map2.put(id, times+map2.get(id));
            }
            else
            map2.put(id, times);
        }
        for (TimeTable teacher : list) {
            System.out.println(teacher.getName()+" "+String.format("%.2f", map2.get(teacher.getIdCode())));
        }
    }

}
