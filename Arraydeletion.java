import java.util.Scanner;
public class Arraydeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int idx=2;
        int arr1[]=new int[arr.length+1];
        for(int i=0;i<idx;i++){
            arr1[i]=arr[i];
        }
        arr1[idx]=20;
        for(int i=idx;i<arr.length;i++){
            arr1[i+1]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
}
