import java.util.Scanner;

public class f6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num%5==0){
            System.out.println("multiple of 5");
        }
        else{
            System.out.println("not multiple of 5");
        }
    }
}