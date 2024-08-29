
import java.util.Scanner;

class Basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        // int arr[]={1,2,3,4,5,6};
        // System.out.println(arr[2]);
        // System.out.println(arr.length);
        //DECLEARATION OF RRAY OR INSERTING ELEMENT IN ARRAY
        int arr[]=new int [5];
        for(int i=0;i<5;i++){
             arr[i]=sc.nextInt();
        }
        //READ OF ARRAY OR ARRAY PRINTING
        for(int i=0;i<5;i++){
           System.out.println(arr[i]);
       }

    }
}