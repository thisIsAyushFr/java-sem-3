import java.util.Scanner;
public class function {
    static int test(int a){
        a++;
        return a;
    }
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("enter a num");
        int a = ob.nextInt();
        System.out.println("output before function" + a);
        a=test(a);
        System.out.println("output after function" + a);
        ob.close();
    }
}
