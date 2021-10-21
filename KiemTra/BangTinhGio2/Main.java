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
        Map<String, Float> map3 = new HashMap<>();
        ArrayList<String> idclasslist =new ArrayList<>();
        for(int i=0;i<numbOfClass;i++)
        {
            String id = input.next().trim();
            String idclass= input.next().trim();
            float times= input.nextFloat();
            idclasslist.add(id+" "+idclass);
            if(map3.containsKey(id))
            {
                map3.put(id, times+map3.get(id)) ;
            }
            else map3.put(id, times);
            map2.put(id+" "+idclass, times);
        }
        input.nextLine();
        String filter = input.nextLine();
        for (TimeTable teacher : list) {
            if(teacher.getIdCode().equals(filter))
            {
                System.out.println("Giang vien: "+teacher.getName());
                for(String id : idclasslist)
                {
                    String[] tmp= id.split("\\s+");
                    if(tmp[0].equals(filter)) 
                    {
                        System.out.println(map1.get(tmp[1])+" "+map2.get(id));
                    }
                }
                System.out.println("Tong: "+String.format("%.2f",map3.get(teacher.getIdCode())));
            }
            
        }
    }

}
