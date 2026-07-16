package class9;
import java.util.*;
public class student {
    String name;
    int m1,m2,m3;

    public student(int m1,int m2,int m3, String name){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.name=name;
    }
    public int totalMarks(){
        return m1+m2+m3;
    }

    public double totalAvg(){
        return (m1+m2+m3)/3;
    }

    public void displayResult(){
        int total = totalMarks();
        double avg = totalAvg();
        System.out.println("Name: "+name);
        System.out.println("Marks1: "+m1 + ','+"Marks2: "+m2 +','+"Marks3: "+m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter marks1 ");
        int m1 = sc.nextInt();
        System.out.println("Enter marks2 ");
        int m2 = sc.nextInt();
        System.out.println("Enter marks3 ");
        int m3 = sc.nextInt();

        student obj = new student(m1, m2, m3, name);
        obj.displayResult();
        sc.close();
    }
}
