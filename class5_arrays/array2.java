package class5_arrays;
import java.util.Scanner;
public class array2 {
    /* public static int search(int arr[], int target, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    } */
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
    //Search target in array
    /*  int target = ob.nextInt();
     for (int i = 0; i < n; i++) {
         if (arr[i] == target) {
             System.out.println(i);
             break;
         }
     }   */
    //System.out.print(search(arr, ob.nextInt(), n));
    //Insert an element
    /* int p = 3;
    int val = 10;
    arr[p] = val;
    for(int i = 0; i < n; i++) {
        System.out.println(arr[i] + " ");
    } */
    //Delete an element
    int p = 2;
    for(int i = p; i < n - 1; i++) {
         arr[i] = arr[i+1];
    }
    for(int i = 0; i < n; i++) {
        System.out.println(arr[i] + " ");
    }
    
    ob.close();
    }
}