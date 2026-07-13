package class5_arrays;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = 8;
        int arr[] =new int[cap];
        for(int i=0;i<cap;i++){
            arr[i] = sc.nextInt();
        }
        //reverse
        int l =0 ;
        int r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            r--;
            l++;
        }
        for(int i=0;i<cap;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
