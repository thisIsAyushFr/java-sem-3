package class11;
public class test {
    int x,y;

    test(){

    }
    public test(test obj){
        this.x=obj.x;
        this.y=obj.y;
    }
    public static void main(String[] args) {
        test ob1 = new test();
        ob1.x=9;
        ob1.y=18;

        test ob2 = new test(ob1);
        System.out.println(ob1.x);
        System.out.println(ob2.x);
    }
}
