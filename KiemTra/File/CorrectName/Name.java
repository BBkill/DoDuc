package CorrectName;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("D:/ZJava/KiemTra/File/CorrectName/INPUT.txt"));
        FileWriter writer = new FileWriter("D:/ZJava/KiemTra/File/CorrectName/OUTPUT.txt");
        int count = 1;
        while(input.hasNextLine())
        {
            String fullname = input.nextLine();
            String author = "",name="";
            for(int i=0;i<fullname.length();i++)
            {
                if(fullname.charAt(i)==']') 
                {
                    author = author + (fullname.charAt(i)+"");
                    for(int j=i+1;j<fullname.length();j++)
                    {   
                        if(fullname.charAt(j)=='.'&&fullname.charAt(j+1)=='c') break;
                        name = name + (fullname.charAt(j)+"");
                    }
                    break;
                }
                else
                {
                    
                    author=author+(fullname.charAt(i)+"");
                    
                }

            }
            
            writer.write(count+"\t"+author+"\t"+name+"\n");
            count++;
        }
        input.close();
        writer.close();

    }    
}
