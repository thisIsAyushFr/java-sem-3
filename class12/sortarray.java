package class12;

public class sortarray {
    public static void main(String[] args) {
     int arr[]={1,2,5,4};  
     
     int min = arr[0];
     int max = arr[0];

     for(int i : arr){
        if(i<min) min = i;
        if(i>max) max=i;
         }

         System.out.println("MAX IS "+max);
         System.out.println("MIN IS "+min);
    }
}
