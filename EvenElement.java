import java.util.Scanner;
public class EvenElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" ");
            }
        }


    }
}
