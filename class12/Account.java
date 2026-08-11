package class12;

class Account {

    Account() {
        System.out.println("Default account");
    }

    Account(String name) {
        System.out.println("Account holder: " + name);
    }

    Account(String name, double balance) {
        System.out.println("Holder: " + name + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        new Account();
        new Account("Ram");
        new Account("Ram", 10000);
    }
}