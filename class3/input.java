import java.util.Scanner;
public class input {
    public static void main(String[] args){
           Scanner ob = new Scanner(System.in);
           //Scanner is class | ob is instance | new is constructor | system.in is for input
           int x = ob.nextInt(); // for int
           String y = ob.next(); //for string without afterspace aka ayush sharma input will only be taken as ayush
           ob.nextLine();         // If u dont use this it will not work
           String z = ob.nextLine();// for string with after space too aka ayush sharma input will be taken full
           String a = ob.next();
           System.out.println("Num is " + x);
           System.out.println("str1 is " + y);
           System.out.println("str2 is " + z);
           System.out.println("str3 is " + a);
           ob.close();
    }
}
