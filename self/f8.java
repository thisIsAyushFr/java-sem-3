import java.util.Scanner;

public class f8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");
        int num1 = sc.nextInt();
        System.out.print("Enter b: ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}