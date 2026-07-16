package class8;
import java.util.Scanner;
public class series_cal {
    void calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i - 1;
        }
        System.out.println("Sum of first " + n + " odd numbers: " + sum);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = obj.nextInt();
        obj.close();
        series_cal obj1 = new series_cal();
        obj1.calculateSum(n);
    }
}
