package class11;

public class copy_constructor {
    int x,y;
copy_constructor(){
    System.out.println("Default Constructor");
}
copy_constructor(copy_constructor ob){
    this.x=ob.x;
    this.y=ob.y;
}
public static void main(String[] args) {
    copy_constructor ob1 = new copy_constructor();
    ob1.x=10;
    ob1.y=20;
    copy_constructor ob2 = new copy_constructor(ob1);

    System.out.println(ob1.x);
    System.out.println(ob2.x);
}
}
