package class4_strings;

public class strings_learning {
    public static void main(String[] args) {
       //String name = "Ayush Sharma";
       String name = new String("Ayush Sharma");
       System.out.println(name);
       System.out.println(name.length());
       System.out.println(name.charAt(0));
       String s1 = "ayush";
       System.out.println(s1.equals(name));
       System.out.println(name.contains(s1));
       System.out.println(name.indexOf("ayush"));
       
       String s2 = "Ayush Sharma";
       if (name == s2) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }
       
       if(name.equals(s2)) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }
       s1 = s1 + " Sharma";
       System.out.println(s1);
       System.out.println(s2);

       String s3 = "Ayush Sharma";
       if(name.equals(s3)) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }

       if(name == s3) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }

       String r = "Ayush";
       String s = r;
       r = r + " Sharma";
       System.out.println(r);
       System.out.println(s);

       /* StringBuilder sb = new StringBuilder("ayush");
       StringBuffer sbf = new StringBuffer("ayush");
       if (sb == sbf) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       } */

       String str = "Hello";
       System.out.println(str.toUpperCase());
       System.out.println(str.toLowerCase());
}
}
