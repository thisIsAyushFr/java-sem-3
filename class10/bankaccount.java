package class10;

import java.util.*;
public class bankaccount {
    String username;
    int accountNumber;
    int totalAmount;
    int amountWid = 0;
    int amountCredited = 0;
   
    public bankaccount(String username, int accountNumber) {
        this.username = username;
        this.accountNumber = accountNumber;
    }
    void balance(int totalAmount, int amountWid, int amountCredited) {
         this.totalAmount = totalAmount;
         this.amountWid = amountWid;
         this.amountCredited = amountCredited;
         totalAmount = totalAmount - amountWid + amountCredited;
         System.out.println("Balance: " + totalAmount);
         System.out.println("Amount Wiithdrawn: " + amountWid);
         System.out.println("Amount Credited: " + amountCredited);
    }
    void displayInfo(String username, int accountNumber) {
        System.out.println("Username: " + username);
        System.out.println("Account Number: " + accountNumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter total amount: ");
        int totalAmount = sc.nextInt();
        System.out.println("Enter amount withdrawn: ");
        int amountWid = sc.nextInt();
        System.out.println("Enter amount credited: ");
        int amountCredited = sc.nextInt();
        bankaccount obj = new bankaccount(username, accountNumber);
        obj.displayInfo(username, accountNumber);
        obj.balance(totalAmount, amountWid, amountCredited);
        sc.close();
    }

}
/* import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class BankAccount {
    private String Username;
    private int Accno;
    private int totalammount;
    private int wid;
    private int cred;

    BankAccount(String Username,int Accno,int totalammount, int wid, int cred){
        this.Username=Username;
        this.Accno=Accno;
        this.totalammount=totalammount;
        this.wid=wid;
        this.cred=cred;
    }

    void setUsername(String Username){
        if(Username.length()>0){
            this.Username=Username;
        }
    }
    void setAccno(int accno) {
        if(Accno>=1000000 && Accno<=999999 ) {
            this.Accno = accno;
        }
    }
    void setWid(int wid){
        if(wid>0){
            this.wid=wid;
        }
        else{
            this.wid=0;
        }
    }
    void setCred(int cred){
        if(cred>0){
            this.cred=cred;
        }
        else{
            this.cred=0;
        }
    }
    int getTotalammount(int totalammount){
        return totalammount+cred-wid;
    }

    int getAccno() {
        return Accno;
    }
    int getWid(){
        return wid;
    }
    int getCred(){
        return cred;
    }
    String getUsername(){
        return Username;
    }
    void display(){
        System.out.println(getUsername());
        System.out.println(getAccno());
        System.out.println(getWid());
        System.out.println(getCred());
        System.out.println(getTotalammount(totalammount));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        int t=sc.nextInt();
        int w=sc.nextInt();
        int c=sc.nextInt();
        BankAccount b= new BankAccount(s,a,t,w,c);
        b.display();
    }
} */
