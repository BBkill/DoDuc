import java.util.Scanner;

public class Exception{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap diem GPA: ");
        while(true)
        {
           
            float GPA = input.nextFloat();
            
            if(GPA>=0&&GPA<=4) break;
            else 
            {
                System.out.print("nhap lai GPA: ");
            }
        }
    }
}