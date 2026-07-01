// void means only updation or modification and returns nothing

public class class1a {
    public static void main(String[] args){
        System.out.println("hello world");
        System.out.print("line2");
        System.out.print("line3\nline4");

        int n=1;
        if(n<10){
            System.out.println("\nn is less than 10");
        }
        else{
            System.out.println("\nn is greater than 10");
        }

        while(n<3){
            System.out.println("n is "+n);
            n++;
        }
    }
}
