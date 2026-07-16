package class10;
import java.util.Scanner;
public class binarysearch {
    public boolean search(int arr[], int t){
        int l=0;
        int r = arr.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]==t){
                return true;
            }
            else if(arr[m]>t){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int t= sc.nextInt();
        sc.close();
        binarysearch task = new binarysearch();
        System.out.println(task.search(arr,t));
    }
}