class Payment {
  double amount;
  Payment(double amount) {
    this.amount=amount;
  }
  void pay(){
    System.out.println("processing payment...");
  }
}
//child class
class CardPayment extends Payment{
  CardPayment(double amount){
    super(amount);
  }
  @Overide
  void pay(){
    System.out.println("Paid ₹" + amount + " using Card");
    }
}
// child class
class CashPayment extends Payment{
  CashPayment(double amount){
    super(amount);
  }
  @Overide
  void pay(){
    System.out.println("Paid ₹" + amount + " using Card");
    }
}
//main class
public class main{
  public static void main (String[] args){
    payment p1=new cardPayment(2000);
    payment p2=new cashPayment(500);'
    p1.pay();
    p2.pay();
  }
}
