package class8;

import java.util.Scanner;
public class rectangle {
    int length;
    int width;
    rectangle() {
        length = 1;
        width = 1;
    }
    void set_value(int l, int w) {
        length = l;
        width = w;
    }
    int get_length() {
       return length;
    }
    int get_width() {
        return width;
    }
   int area() {
    return length * width;
   }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        rectangle obj1 = new rectangle();
        System.out.print("Enter the length: ");
        int l = obj.nextInt();
        System.out.print("Enter the width: ");
        int w = obj.nextInt();
        obj.close();
        obj1.set_value(l, w);
        System.out.println("The area is: " + obj1.area());
    }
}