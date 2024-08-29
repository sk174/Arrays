import java.util.Scanner;



public class InsertMiddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        int i;
        for(i=3;i>=1;i--){
            arr[i+1]=arr[i];
        }
        arr[i+1]=20;
        for(int j=0;j<=5;j++){
            System.out.println(arr[j]);
        }



    }
}
