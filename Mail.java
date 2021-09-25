import java.util.*;
public class Mail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String email[]=new String[100];
       for(int j=0;j<n;j++)
        {
            String name = sc.nextLine().trim().toLowerCase();
            String lst[] = name.split("\\s+");
            StringBuilder tmp=new StringBuilder(lst[lst.length-1]);
            for(int i=0;i<lst.length-1;i++)
            {
                tmp.append(lst[i].charAt(0));
            }
            email[j]=tmp.toString();
            
        }
        for(int i=0;i<n;i++)
        {
            int dd=1;
            for(int j=i-1;j>=0;j--)
            {
                if(email[i].equals(email[j])) d++;
            }
            if(dd==1) System.out.print(email[i]);
            else System.out.print(email[i]+d);
            System.out.println("@ptit.edu.vn");
        }
 
        sc.close();
    }
}