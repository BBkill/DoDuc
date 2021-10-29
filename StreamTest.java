import java.util.ArrayList;
import java.util.Arrays;



public class StreamTest{
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,-5,6,7,8,9,10};
        ArrayList<Integer> numberList = new ArrayList<>();
        int sum=0;
        //tinh tong cac phan tu trong mang
        for(int i=0;i<10;i++)
        {
            sum+=arr[i];
        }
        System.out.println("tong: "+sum);
        
        //tim gia tri dau tien nho hon 0
        for(int i=0;i<10;i++)
        {
            if(arr[i]<0){
                System.out.println("gia tri dau tien nho hon 0 la: "+arr[i]);
                break;
            } 
        }

        //hien thi cac so chan
        System.out.print("cac so chan trong mang: ");
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0) System.out.print(arr[i]+" ");
        }

        //tao mang moi co gia tri cac phan tu gap 2 lan mang cu
        System.out.println();
        System.out.print("mang moi: ");
        for(int i=0;i<10;i++)
        {
            numberList.add(arr[i]*2);
            System.out.print(arr[i]*2+" ");
        }
        
        
       
    }
}