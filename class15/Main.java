package class15;

    abstract class shape{
        public void display(){
            System.out.println("This is a normal function");
        }
        public abstract void calculateArea(int s);
        public abstract void calculateArea(double r);
        public abstract void calculateArea(int l,int b);
    }
     class Square extends shape{
        private int side;
        private int area;
        public void calculateArea(int s){
            this.side=5;
            this.area=this.side * this.side;
            System.out.println("The area of square is "+ this.area);
        }
        public void calculateArea(int l,int b){}
        public void display(){
            System.out.println("Hey i am a sqaure");
            
        }
        public void calculateArea(double s){};
    }

  class rectangle extends shape{
    public void display(){
        System.out.println("Hey i am a rectangle");
    }
        private int l;
        private int b;
        private int area;
        public void calculateArea(int l,int b){
            this.l=5;
            this.b=2;
            this.area=this.l * this.b;
            System.out.println("The area of square is "+ this.area);
        }
        public void calculateArea(int s){};
        public void calculateArea(double s){};
}

    class circle extends shape{
        public void display(){
            System.out.println("Hey i am a circle");
        }
        private double r;
        private double area;
       public void calculateArea(double r){
            this.r=2;
            this.area=this.r * this.r * 3.14;
            System.out.println("The area of square is "+ this.area);
        }
        public void calculateArea(int l,int b){};
        public void calculateArea(int s){};
  public static void main(String[] args) {
    shape obj = new Square();

    obj.display();
    obj.calculateArea(5);

    obj = new rectangle();

    obj.display();
    obj.calculateArea(10, 5);

    obj = new circle();

    obj.display();
    obj.calculateArea(7);
}}
