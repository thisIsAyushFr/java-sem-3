package class15;
public class interfacevsasbtract {
    

    interface shape{
        public void display();
        //public void calculateArea();
    }
     static class Square implements shape{
        public void display(){
            System.out.println("Hey i am a sqaure");
        }
    }

 static class rectangle implements shape{
    public void display(){
        System.out.println("Hey i am a rectangle");
    }
}
public class Main{
    public static void main(String[] args) {
        shape obj = new Square();
        obj.display();
        obj = new rectangle();
        obj.display();

    }
}
}
