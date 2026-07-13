package class4_strings;

public class palindrome {
    public static void main(String[] args) {
            String s = "abcba";
            int l=0;
            int r = s.length()-1;
            int f=0;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    f=1;
                    break;
                }
                r--;
                l++;
            }
            if(f==1){
                    System.out.println(" not palindrome");
            }
            else{
                    System.out.println("Palindrome");
            }
    }

}