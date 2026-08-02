package class12;

public class complexadd {
    private int real;
    private int image;

    public complexadd(int r, int i){
        this.image=i;
        this.real=r;
    }
    public void display(){
        System.out.println("Real "+real+" Image "+image);
    }

    complexadd(complexadd c1,complexadd c2){
        this.real=c1.real+c2.real;
        this.image=c1.image+c2.image;
    }

    public static void main(String[] args) {
        complexadd o1 = new complexadd(5,5);
        complexadd o2 = new complexadd(5,5);
        

        complexadd s = new complexadd(o1,o2);

        s.display();
    }
}
