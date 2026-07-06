package class4_strings;

public class charArray1 {
    public static void main(String[] args) {
        String s = new String("Hello"); // String is immutable
        StringBuffer s1 = new StringBuffer("World"); // it is mutable this is multi thread
        StringBuilder s2 = new StringBuilder("!!"); // mutable but not thread safe but single thread

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}

