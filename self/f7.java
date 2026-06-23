import java.util.Scanner;

public class f7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}