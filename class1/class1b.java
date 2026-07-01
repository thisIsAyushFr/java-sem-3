public class class1b {
    public static void main(String[] args){

        //pattern 1
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("pattern 2");

        
        //pattern 2
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("pattern 3");

        //pattern 3

        for(int i=4;i>=0;i--){
            for(int j=0;j<=(4-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("pattern 4");


        //pattern 4

        for(int i=4;i>=0;i--){
            for(int j=0;j>i;j++){
                System.out.print("_");
            }
            for(int j=4;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("next pattern 5");


        //pattern 5
        for(int i=0;i<4;i++){
            for(int j=i;j<4;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
