package class12;

public class sortedornot {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};

        int l = 0;
        int r = 1;

        while(r < arr1.length){
            if(arr1[r] < arr1[l]){
                System.out.println("False");
                return;
            }
            r++;
            l++;
        }

        System.out.println("True");
    }
}