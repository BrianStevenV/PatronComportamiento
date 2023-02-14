public abstract class Account {
    protected String numberAccount;
    protected double balance;
    protected String openDay;

    public Account(String numberAccount, double balance, String openDay) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.openDay = openDay;
    }

    public abstract double calculateInterest();

    public void record(double amount){
        this.balance += amount;
    }

    public void withdrawl(double amount){
        if(amount<=this.balance){
            this.balance-=amount;
        }   else{
            System.out.println("Dont found balance.");
        }
    }
}
