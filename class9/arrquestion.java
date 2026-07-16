package class9;
import java.util.Scanner;
public class arrquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=1;
        if(n%2==0){
            while(r<=n){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l+=2;
                r+=2;
            }
        }
        else{
            while(r!=n){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l+=2;
                r+=2;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
