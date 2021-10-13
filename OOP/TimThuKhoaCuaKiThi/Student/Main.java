

import  java.util.Scanner;
import  java.util.ArrayList;

public  class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=Integer.parseInt(input.nextLine());
        ArrayList<Students> list = new ArrayList<>();
        float maxx=0f;
        for(int i=1;i<=t;i++)
        {
            String name=input.nextLine();
            String dob = input.nextLine();
            float point = 0f;
            for(int j=0;j<3;j++)
            {
                point = point + Float.parseFloat(input.nextLine());
            }
            maxx= maxx>=point? maxx:point;
            Students student = new Students(i, name,dob,point);
            list.add(student);
        }
        
        
        for(Students student: list)
        {
            if(student.getPoint()==maxx)
            System.out.println(student);
        }
    }
}