package class12;

public class counteltofarr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int c=0;
        int avg =0 ;
        for(int i : arr){
        avg += i;
        }
        avg=avg/5;
        System.out.println(avg);
        for(int i : arr){
        if(i>=avg) c++;
        
    }System.out.println(c);

}
}
