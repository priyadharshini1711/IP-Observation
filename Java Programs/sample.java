class Deposit implements Runnable {

  Account a = new Account();

  public void run() {
    System.out.println("amount deposit: " + amount);
  }
}

class Withdraw implements Runnable {

  Account a = new Account();

  public void run() {
    System.out.println("amount withdraw: ");
  }
}

class Account {

  public static void main(String[] args) {
    final double amount = 100;
    Deposit d = new Deposit();
    Withdraw w = new Withdraw();

    Thread dt = new Thread(d);
    Thread dw = new Thread(w);
    dt.start();
    dw.start();
  }
}
