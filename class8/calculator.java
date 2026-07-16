package class8;
import java.util.Scanner;
public class calculator {
    void sum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("Sum: " + sum);
    }

    void difference(int n1, int n2) {
        int diff = n1 - n2;
        System.out.println("Difference: " + diff);
    }

    public static void main(String[] args) { // take input of parameters
        Scanner obj1 = new Scanner(System.in);
        int n1 = obj1.nextInt();
        int n2 = obj1.nextInt();
        obj1.close();
        calculator obj = new calculator();
        obj.sum(n1, n2);
        obj.difference(n1, n2);
    }
}