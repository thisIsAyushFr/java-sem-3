public class class2b {
    public static void main(String[] args){
        int n=6;
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("next\n");

        int m=5;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}


//1
//1 2 1
//1 2 3 2 1
//1 2 3 4 3 2 1


//1
//1 2
//1 2 3