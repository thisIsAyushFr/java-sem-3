package class8;

public class student {
    String name;
    int roll;
    int marks;

    void Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    String calcGrade() {
        if(marks >= 80) return "Grade A";
        else if(marks >= 70) return "Grade B";
        else if(marks >= 60) return "Grade C";
        else return "Grade D";
    }
    void displayInfo(String name, int roll, int marks) {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.Student("Ayush Sharma", 1, 80);
        s2.Student("Ayush", 2, 70);
        s3.Student("Sharma", 3, 60);
        s1.displayInfo(s1.name, s1.roll, s1.marks);
        System.out.println(s1.calcGrade());
        s2.displayInfo(s2.name, s2.roll, s2.marks);
        System.out.println(s2.calcGrade());
        s3.displayInfo(s3.name, s3.roll, s3.marks);
        System.out.println(s3.calcGrade());    
    }
}