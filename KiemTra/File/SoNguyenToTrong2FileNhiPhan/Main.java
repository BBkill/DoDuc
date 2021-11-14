package SoNguyenToTrong2FileNhiPhan;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import java.util.TreeMap;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) input1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) input2.readObject();
        
        int a1[]= new int[10000];
        int a2[] = new int[10000];
        for (Integer i : list1) {
            if(check(i)) a1[i]++;
        }
        for (Integer i : list2) {
            if(check(i)) a2[i]++;
        }
        for(int i=0;i<10000;i++)
        {
            if(a1[i]>0&&a2[i]>0) System.out.println(i+ " "+ a1[i]+" "+a2[i]);
        }
        
    }
    public static boolean check(int n)
    {
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}
