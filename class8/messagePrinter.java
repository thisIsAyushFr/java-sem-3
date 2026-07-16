package class8;
//1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".
public class messagePrinter {
    void printMessage(String name) {
        System.out.println("Hello" + name);
    }

    public static void main(String[] args) {
        messagePrinter obj = new messagePrinter();
        obj.printMessage(" Ayush" );
    }
}
