package class13;

class Main1 {
    int a;
    static int b = 7;
    static {
        System.out.println("G1");
    }
}
    public class G1{
        static int x = 6;
        static {
            System.out.println("G1 is good");
        }
        public static void main(String[] args) {
            //System.out.println(x);
            Main1 ob1 = new Main1();
            ob1.a = 23;
            ob1.b = 24;
            Main1 ob2 = new Main1();
            ob2.a = 145;
            ob2.b = 29;
            /* System.out.println(ob1.a);
            System.out.println(ob1.b);
            System.out.println(ob2.a);
            System.out.println(ob2.b); */
           // System.out.println(Main1.b);
        }
    }