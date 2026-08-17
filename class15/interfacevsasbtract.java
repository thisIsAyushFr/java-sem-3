package class15;
public class interfacevsasbtract {
    

    interface shape{
        public void display();
        public void calculateArea();
    }
     static class Square implements shape{
        public void display(){
            System.out.println("Hey i am a sqaure");
        }
        public void calculateArea(){
            int area;
            int side=5;
            area=side*side;
            System.out.println("Area of sqaure is " + area);
        }
    }

 static class rectangle implements shape{
    public void display(){
        System.out.println("Hey i am a rectangle");
    }
    public void calculateArea(){
            int area;
            int len=5;
            int breadth=3;
            area=len*breadth; 
            System.out.println("Area of rectangle is " + area);
        }
}
public class Main{
    public static void main(String[] args) {
        shape obj = new Square();
        obj.display();
        obj.calculateArea();
        obj = new rectangle();
        obj.display();
        obj.calculateArea();

    }
}
}
