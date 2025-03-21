interface bankac {
   void credit (double amount);
   void debit (double amount);
   void displaybalance();
}
class bankdetails implements bankac {
   private double balance;
   public bankdetails(double initialbalance) {
   balance = initialbalance;
}
public void credit(double amount) {
    if (amount > 0) {
    balance +=amount;
    System.out.println(" $ "+ amount +" credited. ");
    } else {
    System.out.println("No amount credited");
   }
  }
public void debit(double amount) {
    if (amount > 0 && amount<=balance) {
    balance -=amount;
    System.out.println("$" + amount +" debited. ");
    } else {
    System.out.println("Insufficient balance");
    }
  }
public void displaybalance() {
   System.out.println("Current balance:"+ balance);
 }
}
public class Experiment5a{
  public static void main(String[] args) {
   bankdetails myac = new bankdetails (600.0);
   myac.credit(50.0);
   myac.debit(10.0);
   myac.displaybalance();
  }
 } 